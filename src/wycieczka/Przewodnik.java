package wycieczka;

import java.util.ArrayList;
import java.util.List;

public class Przewodnik extends Pracownik {
    private List<String> jezyki = new ArrayList<>();
    private List<Wycieczka> wycieczki = new ArrayList<>();

    public Przewodnik(String imie, String nazwisko, String numerTelefonu, double pensja, String jezykNatywny) {
        super(imie, nazwisko, numerTelefonu, pensja);
        jezyki.add(jezykNatywny);
    }

    public List<Wycieczka> getWycieczki() {
        return wycieczki;
    }

    public List<String> getJezyki() {
        return jezyki;
    }

    public void setJezyki(List<String> jezyki) {
        this.jezyki = jezyki;
    }
}
