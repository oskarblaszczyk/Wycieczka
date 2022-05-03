package wycieczka;

public abstract class Pracownik extends Osoba {
    private double pensjaMinimalna = 2500;
    private double pensja;
    private double przepracowaneGodziny;

    public Pracownik(String imie, String nazwisko, String numerTelefonu, double pensja) {
        super(imie, nazwisko, numerTelefonu);
        this.pensja = pensja;
    }

    public double getPensjaMinimalna() {
        return pensjaMinimalna;
    }

    public void setPensjaMinimalna(double pensjaMinimalna) {
        this.pensjaMinimalna = pensjaMinimalna;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public double getPrzepracowaneGodziny() {
        return przepracowaneGodziny;
    }

    public void setPrzepracowaneGodziny(double przepracowaneGodziny) {
        this.przepracowaneGodziny = przepracowaneGodziny;
    }
}
