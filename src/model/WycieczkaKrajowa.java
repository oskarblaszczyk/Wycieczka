package model;

import java.io.IOException;

public class WycieczkaKrajowa extends Wycieczka {
    private final String miasto;

    public WycieczkaKrajowa(double cena, MotywWycieczki motyw, double ocena, Przewodnik przewodnik, String miasto) throws IOException {
        super(cena, motyw, ocena, przewodnik);
        this.miasto = miasto;
    }

    public String getMiasto() {
        return miasto;
    }
}
