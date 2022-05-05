package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Wycieczka {
    private int id;
    private double cena;
    private final MotywWycieczki motyw; //todo enum - zrobione
    private double ocena; // 0 - 5
    private Przewodnik przewodnik;
    private KartaInformacyjna kartaInformacyjna;
    private List<KlientZarejestrowany> klienci = new ArrayList<>();

    public Wycieczka(double cena, MotywWycieczki motyw, double ocena, Przewodnik przewodnik) throws IOException {
        if (przewodnik == null){
            throw new IllegalArgumentException("Argument nie może być nullem"); // Wycieczka musi miec przewodnika
        }
        this.cena = cena;
        this.motyw = motyw;
        this.ocena = ocena;
        this.przewodnik = przewodnik;
        przewodnik.getWycieczki().add(this);
        id = odczytajId();
        zapiszId(id + 1);
    }

    //todo ID zapis/odczyt plik- zrobione
    private void zapiszId(int id) throws IOException {
        FileWriter fw = new FileWriter("wycieczkaid");
        fw.write(String.valueOf(id));
        fw.close();
    }

    private int odczytajId() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("wycieczkaId"));
        return Integer.parseInt(br.readLine());
    }

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

    public MotywWycieczki getMotyw() {
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
