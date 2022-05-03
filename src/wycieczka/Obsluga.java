package wycieczka;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Obsluga {
    private final LocalDate data;
    private final PracownikObslugiKlienta pracownikObslugiKlienta;
    private final KlientZarejestrowany klient;
    private final Wycieczka wycieczka;

    public Obsluga(LocalDate data, PracownikObslugiKlienta pracownikObslugiKlienta, KlientZarejestrowany klient, Wycieczka wycieczka) {
        this.data = data;
        this.pracownikObslugiKlienta = pracownikObslugiKlienta;
        this.klient = klient;
        this.wycieczka = wycieczka;
        pracownikObslugiKlienta.getObslugaKlientow().add(this);
        klient.getObslugaKlientow().add(this);
    }

    public LocalDate getData() {
        return data;
    }

    public PracownikObslugiKlienta getPracownikObslugiKlienta() {
        return pracownikObslugiKlienta;
    }

    public KlientZarejestrowany getKlient() {
        return klient;
    }

    public Wycieczka getWycieczka() {
        return wycieczka;
    }
}
