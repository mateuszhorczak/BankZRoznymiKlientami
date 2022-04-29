package com.github.mateuszhorczak;

public class DuzaFirma extends Firma {
    public DuzaFirma(String nazwa, String KRS) {
        super(nazwa, KRS);
    }

    @Override
    public String toString() {
        return "DuzaFirma{" +
                "konta=" + konta +
                '}';
    }
}
