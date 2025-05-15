package com.atm.service;

public class LogoutService {
    private boolean loggedIn = true;

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void logout() {
        loggedIn = false;
    }
}
