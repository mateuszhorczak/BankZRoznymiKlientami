package com.github.mateuszhorczak;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Klient> klienci;

    public Bank(List<Klient> klienci) {
        this.klienci = klienci;
    }

    public Bank() {
        this.klienci = new ArrayList<>();
    }

    public List<Klient> getKlienci() {
        return klienci;
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    @Override
    public String toString() {
        var toReturn = new StringBuilder();
        for (var item : this.klienci) {
            toReturn.append(item).append("\n");
        }
        return toReturn.toString();
    }

    public double getFirm() {
        List<Klient> firmy = new ArrayList<>();
        for (var item : this.klienci) {
            if (item instanceof Firma) {
                firmy.add(item);
            }
        }
        return Bank.getSumaSald(firmy);
    }

    public double getOsobFizycznych() {
        List<Klient> osobyFizyczne = new ArrayList<>();
        for (var item : this.klienci) {
            if (item instanceof Osoba) {
                osobyFizyczne.add(item);
            }
        }
        return Bank.getSumaSald(osobyFizyczne);
    }

    public double getDuzychFirmIWaznychOsob() {
        List<Klient> duzychFirm = new ArrayList<>();
        for (var item : this.klienci) {
            if (item instanceof DuzaFirma || item instanceof WaznaOsoba) {
                duzychFirm.add(item);
            }
        }
        return Bank.getSumaSald(duzychFirm);
    }

    public double getZwyklychOsob() {
        List<Klient> zwykleOsoby = new ArrayList<>();
        for (var item : this.klienci) {
            if (item instanceof Osoba && !(item instanceof WaznaOsoba)) {
                zwykleOsoby.add(item);
            }
        }
        return Bank.getSumaSald(zwykleOsoby);
    }

    private static double getSumaSald(List<Klient> klienci) {
        double sumaSald = 0.0;
        for (var item : klienci) {
            for (var konto : item.getKonta()) {
                sumaSald += konto.getSaldo();
            }
        }
        return sumaSald;
    }


}
