package main;

public class Calculator {
    //tutaj deklaruje jakich obiektów będę używać w tej klasie
    private CalculatorView view;
    //tworzę input który będzie trzymać mi stan obecny kalkulatora. Będę go przekazywać do metod i zapisywać na nim dane
    //taka podręczna baza danych
    private Input input;

    public Calculator() {
        //inicjalizuje je w konstruktorze, czyli powstaną jak utworzymy obiekt poprzez new Calculator()
        view = new CalculatorView();
        input = new Input();
    }

    public void run() {
        view.printMenu();
        //przekazuje obiekt input do metody. To co do niego dojdzie w tej metodzie będzie widoczne dalej tu na poziomie
        //klasy kalkulator
        view.getMenuOption(input);
        //przekazuje input już z operacją arytmetyczną
        view.getNumbersToCalculate(input);
        //przekazuje input z operacją arytmetyczną i liczbami
        view.performCalculation(input);
    }
}
