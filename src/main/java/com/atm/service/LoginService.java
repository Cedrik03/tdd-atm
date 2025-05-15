package com.atm.service;

import java.util.HashMap;
import java.util.Map;

public class LoginService {
    private final Map<String, String> userDatabase = new HashMap<>();

    public LoginService() {
        userDatabase.put("user1", "1234");
        userDatabase.put("user2", "5678");
    }

    public boolean login(String username, String pin) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(pin);
    }
}
