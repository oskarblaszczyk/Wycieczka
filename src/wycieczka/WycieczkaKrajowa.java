package wycieczka;

public class WycieczkaKrajowa extends Wycieczka {
    private final String miasto;

    public WycieczkaKrajowa(double cena, String motyw, double ocena, Przewodnik przewodnik, String miasto) {
        super(cena, motyw, ocena, przewodnik);
        this.miasto = miasto;
    }

    public String getMiasto() {
        return miasto;
    }
}
