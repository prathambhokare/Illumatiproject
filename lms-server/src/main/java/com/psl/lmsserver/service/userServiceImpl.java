package com.psl.lmsserver.service;

import com.psl.lmsserver.dao.RoleRepo;
import com.psl.lmsserver.dao.UserRepo;
import com.psl.lmsserver.exceptions.InvalidInputException;
import com.psl.lmsserver.models.Role;
import com.psl.lmsserver.models.User;
import com.psl.lmsserver.service.helper.userHelper;
import com.psl.lmsserver.service.helper.userHelperImpl;
import com.psl.lmsserver.service.helper.userResponse;
import com.psl.lmsserver.util.encrypt_decrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class userServiceImpl implements userService {
    private final Logger logger= LoggerFactory.getLogger(getClass());
    @Autowired
    private UserRepo userRepoobj;
    @Autowired
    private RoleRepo roleRepoobj;
    private userHelper userHelperobj=new userHelperImpl();
    @Value("${secret.key}")
    private String secret_Key;
    @Override
    public User addUser(Map<String, Object> user_details) throws Exception {
        User user = userHelperobj.convertToObject(user_details);
        String role_name = null;
        String senior_name = null;
        for (Map.Entry<String, Object> entry : user_details.entrySet()) {
            if (entry.getKey() == "reports_to") {
                senior_name = entry.getValue().toString();
            } else if (entry.getKey() == "role") {
                role_name = entry.getValue().toString();
            }
        }
        String encryptedData = encrypt_decrypt.encrypt(user.getPassWord(), secret_Key);
        user.setPassWord(encryptedData);
        Role role = null;
        role = roleRepoobj.findRoleByName(role_name);
        if (role != null) {
            logger.info("The user role is added");
            user.setRoletable(role);
        } else {
            String decryptedData = encrypt_decrypt.decrypt(user.getPassWord(), secret_Key);
            user.setPassWord(decryptedData);
            logger.error("The user is role is Invalid");
            throw new InvalidInputException("The User Role is Invalid");
        }
        if (userRepoobj.getUserByEmailId(user.getEmail()) == null) {
            User new_user = null;
            new_user = userRepoobj.getUserByEmailId(senior_name);
            logger.info("The user by email id is"+new_user.getEmail());
            if (new_user != null) {
                user.setSeniorId(new_user.getUserId());
            }
            userRepoobj.save(user);
            String decryptedData = encrypt_decrypt.decrypt(user.getPassWord(), secret_Key);
            user.setPassWord(decryptedData);
            logger.info("The User Added SuccessFully!");
        } else {
            logger.error("The User Already present with the Same Email id");
            throw new InvalidInputException("The User Already Present With Same Email id");
        }
        return user;
    }
    @Override
    public List<userResponse> getAllUser() {
        List<User> users=userRepoobj.findAll();
        List<userResponse> newusers=new ArrayList<userResponse>();
        for (User i : users) {
            logger.info("True here");
            int senior_id=i.getSeniorId();
            logger.info("The id of the user is"+senior_id);
            String senior_name=null;
            if (senior_id!=0) {
                User user = userRepoobj.getUserById(senior_id);
                senior_name = user.getName();
            }
            userResponse user=new userResponse(i.getUserId(),i.getName(),i.getEmail(),i.getDept_name(),senior_name,i.getRoletable().getName());
            newusers.add(user);
        }
        return newusers;
    }

    @Override
    public List<User> searchByKeyWord(String keyword) throws Exception {
        List<User> users=userRepoobj.findByKeyword(keyword);
        if (users.isEmpty()){
            throw new Exception("The Not Found for "+keyword);
        }
        return users;
    }
}
