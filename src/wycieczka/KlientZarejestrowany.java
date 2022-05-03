package wycieczka;

import java.util.ArrayList;
import java.util.List;


public class KlientZarejestrowany extends Klient {
    private static int ostatnieId = 10000;
    private final int id;
    public static List<KlientZarejestrowany> klienciZarejestrowani = new ArrayList<>();
    private List<Obsluga> obslugaKlientow = new ArrayList<>();

    public KlientZarejestrowany(String imie, String nazwisko, String numerTelefonu) {
        super(imie, nazwisko, numerTelefonu);
        this.id = generujID();
        klienciZarejestrowani.add(this);
    }

    private int generujID() {
        int id = ostatnieId + 1;
        ostatnieId = id;
        return id;
    }

    public List<Wycieczka> kupioneWycieczki() {
        List<Wycieczka> wynik = new ArrayList<>();
        for (Obsluga o : obslugaKlientow) {
            wynik.add(o.getWycieczka());
        }
        return wynik;
    }

    private double sumaWydatkow() {
        double wynik = 0;
        for (Obsluga o : obslugaKlientow) {
            wynik += o.getWycieczka().getCena();
        }
        return wynik;
    }

    public static KlientZarejestrowany wydalNajwiecej(List<KlientZarejestrowany> klient) {
        if (klient == null || klient.isEmpty()) {
            throw new IllegalArgumentException("Lista nie moze byc nullem ani pusta");
        }
        KlientZarejestrowany wynik = klient.get(0);
        double sumaTemp = wynik.sumaWydatkow();
        for (KlientZarejestrowany k : klient) {
            double s = k.sumaWydatkow();
            if (sumaTemp < s) {
                wynik = k;
                sumaTemp = s;
            }
        }
        return wynik;
    }

    // tymczasowo kasowanie z ekstensji- docelowo bedziemy z bazy danych wywalac
    public void remove() {
        klienciZarejestrowani.remove(this);
    }


    public static List<KlientZarejestrowany> getKlienciZarejestrowani() {
        return klienciZarejestrowani;
    }

    public int getId() {
        return id;
    }

    public List<Obsluga> getObslugaKlientow() {
        return obslugaKlientow;
    }
}
