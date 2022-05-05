package model;
import java.io.IOException;

public class WycieczkaZagraniczna extends Wycieczka {
    private final String kraj;
    private final SrodekTransportu srodekTrasportu; //todo enum -> zrobione

    public WycieczkaZagraniczna(double cena, MotywWycieczki motyw, double ocena, Przewodnik przewodnik, String kraj, SrodekTransportu srodekTrasportu) throws IOException {
        super(cena, motyw, ocena, przewodnik);
        this.kraj = kraj;
        this.srodekTrasportu = srodekTrasportu;
    }

    public String getKraj() {
        return kraj;
    }

    public SrodekTransportu getSrodekTrasportu() {
        return srodekTrasportu;
    }
}
