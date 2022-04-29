package com.github.mateuszhorczak;

public class Osoba extends Klient{
    private String imie, nazwisko, PESEL;

    public Osoba(String imie, String nazwisko, String PESEL) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }


    @Override
    public String toString() {
        return "Osoba{" +
                "konta=" + konta +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}
