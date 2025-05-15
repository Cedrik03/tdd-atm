package com.atm.service;

public class SaldoService {
    private double saldo = 1000.0;  // Startsaldo

    public double getSaldo() {
        return saldo;
    }

    public void withdrawSaldo(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Uttagsbelopp måste vara positivt");
        }
        if (amount > saldo) {
            throw new IllegalArgumentException("Otillräckligt saldo");
        }
        saldo -= amount;
    }

    public void addSaldo(double amount) {
        if (amount > 0) {
            saldo += amount;
        }
    }
}
