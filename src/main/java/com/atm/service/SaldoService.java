package com.atm.service;

public class SaldoService {
    private double saldo;

    public SaldoService() {
        this.saldo = 1000.0;  // startvärde
    }

    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(double amount) {
        saldo += amount;
    }
}