package com.atm.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsättningServiceTest {

    @Test
    void shouldIncreaseBalanceAfterDeposit() {
        SaldoService saldoService = new SaldoService();
        InsättningService service = new InsättningService(saldoService);

        service.sättIn(500.0);

        assertEquals(500.0, saldoService.getSaldo());
    }
}
