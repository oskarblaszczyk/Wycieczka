package wycieczka;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PracownikObslugiKlienta extends Pracownik{
    private static String ranking = "ranking"; // todo zrobic ranking
    private List<Obsluga> obslugaKlientow = new ArrayList<>(); //nazwa do zmiany

    public PracownikObslugiKlienta(String imie, String nazwisko, double pensja, String numerTelefonu) {
        super(imie, nazwisko, numerTelefonu, pensja);
    }

    public List<Obsluga> getObslugaKlientow() {
        return obslugaKlientow;
    }

    public void sprzedajWycieczke(KlientZarejestrowany klient, Wycieczka wycieczka){
        Obsluga obsluga = new Obsluga(LocalDate.now(), this, klient, wycieczka);

    }
}
