package wycieczka;

import java.util.ArrayList;
import java.util.List;

public class KartaInformacyjna {
    private List<String> ograniczenia = new ArrayList<>();
    private List<String> uwagi = new ArrayList<>();
    private final Wycieczka wycieczka;

    public KartaInformacyjna(Wycieczka wycieczka) {
        this.wycieczka = wycieczka;
    }

    public List<String> getOgraniczenia() {
        return ograniczenia;
    }

    public void setOgraniczenia(List<String> ograniczenia) {
        this.ograniczenia = ograniczenia;
    }

    public List<String> getUwagi() {
        return uwagi;
    }

    public void setUwagi(List<String> uwagi) {
        this.uwagi = uwagi;
    }

    public Wycieczka getWycieczka() {
        return wycieczka;
    }

}
