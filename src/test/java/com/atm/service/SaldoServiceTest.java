package com.atm.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaldoServiceTest {

    @Test
    void shouldReturnCorrectBalance() {
        SaldoService saldoService = new SaldoService();
        double expectedBalance = 1000.0;
        assertEquals(expectedBalance, saldoService.getSaldo());
    }
}
