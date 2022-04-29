package com.github.mateuszhorczak;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var bank = new Bank();

        Osoba osoba = new Osoba("Jan", "Janowski", "1234567890");
        WaznaOsoba waznaOsoba = new WaznaOsoba("Ben", "Benowski", "0987654321");
        Firma firma = new Firma("Fajna Firma", "1234123412");
        DuzaFirma duzaFirma = new DuzaFirma("Duza Firma", "9876987698");

        Konto konto1 = new Konto("11111");
        Konto konto2 = new Konto("22222");
        Konto konto3 = new Konto("33333");
        Konto konto4 = new Konto("44444");
        Konto konto5 = new Konto("55555");
        Konto konto6 = new Konto("66666");
        Konto konto7 = new Konto("77777");

        osoba.dodajKonto(konto1);
        waznaOsoba.dodajKonto(konto2);
        waznaOsoba.dodajKonto(konto3);
        firma.dodajKonto(konto4);
        duzaFirma.dodajKonto(konto5);
        duzaFirma.dodajKonto(konto6);
        duzaFirma.dodajKonto(konto7);

        bank.dodajKlienta(osoba);
        bank.dodajKlienta(waznaOsoba);
        bank.dodajKlienta(firma);
        bank.dodajKlienta(duzaFirma);

        System.out.println(bank);

        System.out.println("Suma srodkow firm wynosi: " + bank.getFirm());
        System.out.println("Suma srodkow osob fizycznych wynosi: " + bank.getOsobFizycznych());
        System.out.println("Suma srodkow duzych firm i waznych osob wynosi: " + bank.getDuzychFirmIWaznychOsob());
        System.out.println("Suma srodkow zwyklych osob wynosi: " + bank.getZwyklychOsob());






    }
}
