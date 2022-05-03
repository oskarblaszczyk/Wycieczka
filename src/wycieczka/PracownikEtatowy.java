package wycieczka;

public class PracownikEtatowy extends Pracownik{
    private String rodzajUmowy;

    public PracownikEtatowy(String imie, String nazwisko, String numerTelefonu, double pensja, String rodzajUmowy) {
        super(imie, nazwisko, numerTelefonu, pensja);
        this.rodzajUmowy = rodzajUmowy;
    }

    public String getRodzajUmowy() {
        return rodzajUmowy;
    }

    public void setRodzajUmowy(String rodzajUmowy) {
        this.rodzajUmowy = rodzajUmowy;
    }
}
