package main;

public class MainClass {

    public static void main(String[] srg) {
        CalculatorView calculator = new CalculatorView();
        calculator.printWelcome();
        CalculatorView.getFirstNumbersToCalculate();
        CalculatorView.getSecondNumbersToCalculate();
        calculator.printMenu();
        calculator.pickMenuItem();
        calculator.performCalculation();
    }
}
