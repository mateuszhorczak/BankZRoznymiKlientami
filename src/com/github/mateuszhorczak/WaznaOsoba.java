package com.github.mateuszhorczak;

public class WaznaOsoba extends Osoba {
    public WaznaOsoba(String imie, String nazwisko, String PESEL) {
        super(imie, nazwisko, PESEL);
    }

    @Override
    public String toString() {
        return "WaznaOsoba{" +
                "konta=" + konta +
                '}';
    }
}
