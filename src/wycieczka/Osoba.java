package wycieczka;

import java.util.ArrayList;
import java.util.List;

public abstract class Osoba {
    private String imie;
    private String nazwisko;
    private List<String> email = new ArrayList<>();
    private String numerTelefonu;

    public Osoba(String imie, String nazwisko, String numerTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
