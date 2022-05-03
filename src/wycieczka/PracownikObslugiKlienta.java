package wycieczka;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PracownikObslugiKlienta extends Pracownik {
    private static String ranking = "ranking"; // todo zrobic ranking
    private List<ObslugaKlienta> obslugaKlientow = new ArrayList<>();

    public PracownikObslugiKlienta(String imie, String nazwisko, String numerTelefonu) {
        super(imie, nazwisko, numerTelefonu);
    }

    public PracownikObslugiKlienta(String imie, String nazwisko, String numerTelefonu, RodzajUmowy rodzajUmowy) {
        super(imie, nazwisko, numerTelefonu, rodzajUmowy);
    }

    public List<ObslugaKlienta> getObslugaKlientow() {
        return obslugaKlientow;
    }

    @Override
    public double pensja() {
        return getPensjaMinimalna() + 1500; //todo wyliczanie pensji na podstawie rodzaju umowy
    }
}
