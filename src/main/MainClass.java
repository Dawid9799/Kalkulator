package main;

public class MainClass {

    public static void main(String[] srg) {
        CalculatorView calculator = new CalculatorView();
        CalculatorView.getNumbersToCalculate();
        calculator.printMenu();
        calculator.pickMenuItem();
        calculator.performCalculation();
    }
}
