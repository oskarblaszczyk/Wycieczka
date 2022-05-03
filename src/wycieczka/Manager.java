package wycieczka;

public class Manager extends Pracownik {
    private double premia;

    public Manager(String imie, String nazwisko, String numerTelefonu, double pensja, double premia) {
        super(imie, nazwisko, numerTelefonu, pensja);
        this.premia = premia;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }
}
