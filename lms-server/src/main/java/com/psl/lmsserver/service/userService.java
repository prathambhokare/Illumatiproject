package com.psl.lmsserver.service;

import com.psl.lmsserver.models.User;
import com.psl.lmsserver.service.helper.userResponse;

import java.util.List;
import java.util.Map;

public interface userService {

    public User addUser(Map<String,Object> user_details) throws Exception;


    public List<userResponse> getAllUser();


    public List<User> searchByKeyWord(String keyword) throws Exception;
}
