package model;

public class Manager extends Pracownik {
    private double premia;

    public Manager(String imie, String nazwisko, String numerTelefonu, double premia) {
        super(imie, nazwisko, numerTelefonu);
        this.premia = premia;
    }

    public Manager(String imie, String nazwisko, String numerTelefonu, RodzajUmowy rodzajUmowy, double premia) {
        super(imie, nazwisko, numerTelefonu, rodzajUmowy);
        this.premia = premia;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }

    @Override
    public double pensja() {
        return getPensjaMinimalna() + getRodzajUmowy().dodatekPensji + premia;
    }
}
