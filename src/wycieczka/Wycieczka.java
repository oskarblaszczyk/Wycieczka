package wycieczka;

import java.util.ArrayList;
import java.util.List;

public abstract class Wycieczka {
    private int id;

    private double cena;
    private final String motyw; //todo ZWIEDZANIE, WYPOCZYNEK, AKTYWNOSC   -> enum?
    private double ocena; // 0 - 5
    private Przewodnik przewodnik;
    private KartaInformacyjna kartaInformacyjna;
    private List<KlientZarejestrowany> klienci = new ArrayList<>();

    public Wycieczka(double cena, String motyw, double ocena, Przewodnik przewodnik) {
        this.cena = cena;
        this.motyw = motyw;
        this.ocena = ocena;
        this.przewodnik = przewodnik;
        przewodnik.getWycieczki().add(this);
    }
    //todo ID zapis/odczyt plik
//    private int generujID() {
//        int id = ostatnieId + 1;
//        ostatnieId = id;
//        return id;
//    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public int getId() {
        return id;
    }

    public String getMotyw() {
        return motyw;
    }

    public Przewodnik getPrzewodnik() {
        return przewodnik;
    }

    public void setPrzewodnik(Przewodnik przewodnik) {
        this.przewodnik = przewodnik;
    }

    public KartaInformacyjna getKartaInformacyjna() {
        return kartaInformacyjna;
    }

    public void setKartaInformacyjna(KartaInformacyjna kartaInformacyjna) {
        this.kartaInformacyjna = kartaInformacyjna;
    }

    public List<KlientZarejestrowany> getKlienci() {
        return klienci;
    }

    @Override
    public String toString() {
        return "Wycieczka{" +
                "id=" + id +
                ", cena=" + cena +
                ", motyw='" + motyw + '\'' +
                ", ocena=" + ocena +
                ", przewodnik=" + przewodnik +
                '}';
    }
}
