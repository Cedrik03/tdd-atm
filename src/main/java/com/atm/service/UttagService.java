package com.atm.service;

public class UttagService {
    private double saldo;

    public UttagService(double startSaldo) {
        this.saldo = startSaldo;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Uttagsbelopp måste vara positivt");
        }
        if (amount > saldo) {
            throw new IllegalArgumentException("Otillräckligt saldo");
        }
        saldo -= amount;
    }

    public double getSaldo() {
        return saldo;
    }
}
