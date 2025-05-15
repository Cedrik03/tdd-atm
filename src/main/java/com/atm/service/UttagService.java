package com.atm.service;

public class UttagService {
    private SaldoService saldoService;

    public UttagService(SaldoService saldoService) {
        this.saldoService = saldoService;
    }

    public void taUt(double amount) {
        try {
            saldoService.withdrawSaldo(amount);
            System.out.println(amount + " kr har tagits ut.");
        } catch (IllegalArgumentException e) {
            System.out.println("Fel: " + e.getMessage());
        }
    }
}
