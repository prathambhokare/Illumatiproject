package com.psl.lmsserver.service.helper;

import com.psl.lmsserver.models.User;

import java.util.Map;

public interface userHelper {
    public User convertToObject(Map<String, Object> mp);
}
