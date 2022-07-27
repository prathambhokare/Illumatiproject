package com.psl.lmsserver.service.helper;

import com.psl.lmsserver.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class userHelperImpl implements userHelper{
    private final Logger logger= LoggerFactory.getLogger(getClass());
    @Override
    public User convertToObject(Map<String, Object> user_details) {
        User user = new User();
        for (Map.Entry<String, Object> entry : user_details.entrySet()) {
            if (entry.getKey() == "name") {
                user.setName(entry.getValue().toString());
            } else if (entry.getKey() == "email") {
                user.setEmail(entry.getValue().toString());
            } else if (entry.getKey() == "mobileNo") {
                user.setMobileNo(entry.getValue().toString());
            } else if (entry.getKey() == "passWord") {
                user.setPassWord(entry.getValue().toString());
            } else if (entry.getKey() == "dept_name") {
                user.setDept_name(entry.getValue().toString());
            } else if (entry.getKey() == "status") {
                user.setStatus(entry.getValue().toString());
            }
        }
        return user;
    }

}
