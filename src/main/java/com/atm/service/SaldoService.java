package com.atm.service;

public class SaldoService {
    private double saldo;


    public SaldoService() {
        this.saldo = 1000.0;
    }


    public SaldoService(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
