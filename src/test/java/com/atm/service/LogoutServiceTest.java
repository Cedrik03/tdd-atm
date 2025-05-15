package com.atm.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LogoutServiceTest {

    @Test
    void shouldLogoutUser() {
        LogoutService logoutService = new LogoutService();

        assertTrue(logoutService.isLoggedIn(), "bör börja som inloggad");

        logoutService.logout();

        assertFalse(logoutService.isLoggedIn(), "Användare ska vara utloggad");
    }
}
