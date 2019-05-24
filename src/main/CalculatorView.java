package main;

import java.util.Scanner;

public class CalculatorView {
    Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public void printMenu() {
        System.out.println("-----------------");
        System.out.println("------MENU-------");
        System.out.println("-----------------");
        System.out.println("1. ADD");
        System.out.println("2. SUBSTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");
        System.out.println("-----------------");
    }

    public void getMenuOption(Input input) {
        String menuItemChoice = scanner.nextLine();

        //metoda sprawdza czy wybrany numer z menu jest poprawny. Zwraca ona booleana czyli jeżeli metoda zwróci true
        //to wejdzie do ifa jeżeli false to wykona się else
        if (Validator.isMenuOperationValid(menuItemChoice)) {
            input.setMenuOption(Integer.parseInt(menuItemChoice));
        }
        else {
            //wykonaj metode jeszcze raz dalej trzymając ten sam obiekt input
            getMenuOption(input);
        }
    }

    public void getNumbersToCalculate(Input input) {
        System.out.println("Pick first number");
        String firstNumber = scanner.nextLine();
        System.out.println("Pick second number");
        String secondNumber = scanner.nextLine();

        //znowu dwie metody walidujące które zwracają booleana. Obie muszą dać return true zeby if się wykonał
        if (Validator.isInputANumber(firstNumber) && Validator.isInputANumber(secondNumber)) {
            input.setFirstNr(Integer.parseInt(firstNumber));
            input.setSecondNr(Integer.parseInt(secondNumber));
        }
        else {
            //wykonaj metode jeszcze raz dalej trzymając ten sam obiekt input
            getNumbersToCalculate(input);
        }
    }

    //przekazuje input który zawiera wszystkie potrzebne informacje
    public void performCalculation(Input input) {
        switch (input.getMenuOption()) {
            case 1:
                System.out.println("WYNIK: " + CalculatorServer.add(input.getFirstNr(), input.getSecondNr()));
                break;

            case 2:
                System.out.println(
                        "WYNIK: " + CalculatorServer.subtract(input.getFirstNr(), input.getSecondNr()));
                break;

            case 3:
                System.out.println(
                        "WYNIK: " + CalculatorServer.multiply(input.getFirstNr(), input.getSecondNr()));
                break;

            case 4:
                if (input.getSecondNr() != 0) {
                    System.out.println(
                            "WYNIK: " + CalculatorServer.divide(input.getFirstNr(), input.getSecondNr()));
                }
                else {
                    System.out.println("CAN'T DIVIDE BY ZERO!!");
                    System.out.println("--------------------------------");
                }
                break;

            default:
                throw new RuntimeException("THIS SHOULD NEVER HAPPEN :D");
        }
    }
}
