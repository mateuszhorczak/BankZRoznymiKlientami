package com.github.mateuszhorczak;

public class Firma extends Klient {
    private String nazwa, KRS;

    public Firma(String nazwa, String KRS) {
        this.nazwa = nazwa;
        this.KRS = KRS;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "nazwa='" + nazwa + '\'' +
                ", KRS='" + KRS + '\'' +
                ", konta=" + konta +
                '}';
    }
}
