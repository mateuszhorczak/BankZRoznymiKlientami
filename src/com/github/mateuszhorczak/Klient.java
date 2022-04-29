package com.github.mateuszhorczak;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    protected List<Konto> konta;

    public Klient() {
        this.konta = new ArrayList<Konto>();
    }

    public List<Konto> getKonta() {
        return konta;
    }

    public void dodajKonto(Konto konto) {
        konta.add(konto);
    }

    @Override
    public String toString() {
        return "Klient{" +
                "konta=" + konta +
                '}';
    }
}

