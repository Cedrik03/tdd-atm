package com.atm.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UttagServiceTest {

    @Test
    void withdrawShouldReduceSaldo() {
        UttagService uttagService = new UttagService(1000.0);
        uttagService.withdraw(200.0);
        assertEquals(800.0, uttagService.getSaldo());
    }

    @Test
    void withdrawMoreThanSaldoShouldThrow() {
        UttagService uttagService = new UttagService(500.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            uttagService.withdraw(600.0);
        });
        assertEquals("Otillräckligt saldo", exception.getMessage());
    }

    @Test
    void withdrawNegativeAmountShouldThrow() {
        UttagService uttagService = new UttagService(500.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            uttagService.withdraw(-100.0);
        });
        assertEquals("Uttagsbelopp måste vara positivt", exception.getMessage());
    }
}
