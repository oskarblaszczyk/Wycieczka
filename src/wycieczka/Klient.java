package wycieczka;

import java.util.ArrayList;
import java.util.List;

public abstract class Klient extends Osoba {
    private static List<Klient> klienci = new ArrayList<>();

    public Klient(String imie, String nazwisko, String numerTelefonu) {
        super(imie, nazwisko, numerTelefonu);
        klienci.add(this);
    }

    public static List<Klient> getKlienci() {
        return klienci;
    }

}
