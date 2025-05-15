package com.atm.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {

    @Test
    void trueIfCorrect() {
        LoginService loginService = new LoginService();

        boolean result = loginService.login("user1", "1234");

        assertTrue(result);
    }

    @Test
    void falseIfIncorrect() {
        LoginService loginService = new LoginService();

        boolean result = loginService.login("user1", "wrong");

        assertFalse(result);
    }
}
