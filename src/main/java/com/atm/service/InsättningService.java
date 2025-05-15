package com.atm.service;

public class InsättningService {
    private SaldoService saldoService;

    public InsättningService(SaldoService saldoService) {
        this.saldoService = saldoService;
    }

    public void sättIn(double amount) {
        if (amount > 0) {
            saldoService.addSaldo(amount);
            System.out.println(amount + " kr har satts in.");
        } else {
            System.out.println("Beloppet måste vara större än 0.");
        }
    }
}
