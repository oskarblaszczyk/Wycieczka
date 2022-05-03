package wycieczka;

public class WycieczkaZagraniczna extends Wycieczka {
    private final String kraj;
    private final String srodekTrasportu; //todo enum

    public WycieczkaZagraniczna(double cena, String motyw, double ocena, Przewodnik przewodnik, String kraj, String srodekTrasportu) {
        super(cena, motyw, ocena, przewodnik);
        this.kraj = kraj;
        this.srodekTrasportu = srodekTrasportu;
    }

    public String getKraj() {
        return kraj;
    }

    public String getSrodekTrasportu() {
        return srodekTrasportu;
    }
}
