package com.github.mateuszhorczak;

public class Konto {

    private String numer;
    private double saldo;

    Konto(String numer) {

        this.numer = numer;
        saldo = 100;
    }

    public Konto(String numer, double saldo) {
        this.numer = numer;
        this.saldo = saldo;
    }

    public String getNumer() {

        return numer;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean wplac(double kwota) {
        return true;
    }

    public boolean wyplac(double kwota) {
        return true;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "numer='" + numer + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
