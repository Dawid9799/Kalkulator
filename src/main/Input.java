package main;

//nasza mini baza danych która zbiera dane podczas działania programu i jest przekazywana pomiędzy klasy
public class Input {
    private int menuOption;
    private double firstNr;
    private double secondNr;

    //nie robię tutaj konktruktora public Input() bo jak ostatnio ci mówiłem, pustego konstruktora nie trzeba pisac
    //generuje się sam podczas działania aplikacji


    public int getMenuOption() {
        return menuOption;
    }

    public void setMenuOption(int menuOption) {
        this.menuOption = menuOption;
    }

    public double getFirstNr() {
        return firstNr;
    }

    public void setFirstNr(double firstNr) {
        this.firstNr = firstNr;
    }

    public double getSecondNr() {
        return secondNr;
    }

    public void setSecondNr(double secondNr) {
        this.secondNr = secondNr;
    }
}
