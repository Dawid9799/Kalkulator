package main;

import java.util.Scanner;

public class Input {

    //musisz poczytać o metodach statycznych :p większy temat do wytłumaczenia ale tutaj źle użyty
    // w serverze dobrze użyty :)
    private static String firstUserNumber;
    private static String secondUserNumber;
    private static double checkFirstUserNumber;
    private static double checkSecondUserNumber;

    public static double getCheckFirstUserNumber() {
        return checkFirstUserNumber;
    }

    public static double getCheckSecondUserNumber() {
        return checkSecondUserNumber;
    }

    //podzieliliśmy klasy według ich odpowiedzialności. Klasa Input miała trzymać odebrane parametry usera
    //a widzę że zajęła przejmować wyświetlanie menu za co odpowiada CalculatorView
    public static void getNumbersToCheck() {
        Scanner scanner = new Scanner(System.in);
        //to po angielsku czy po polsku jest ta apka :D
        System.out.println("WITAJ W KALKULATORZE!");
        System.out.print("Podaj pierwszą liczbę: ");
        firstUserNumber = scanner.nextLine();
        System.out.print("Podaj drugą liczbę: ");
        secondUserNumber = scanner.nextLine();
    }

    //może checkInputValues() bo jeszcze nie wiemy czy to numbers dlatego nazwałem to values :p
    //ogolnie taka metoda prosi się żeby przyjmowała ten input na wejściu do metody. W powyższej metodzie też :p
    public static void checkTheGetNumbers() {
        try {
            checkFirstUserNumber = Double.valueOf(firstUserNumber);
            checkSecondUserNumber = Double.valueOf(secondUserNumber);
        } catch (NumberFormatException e) {
            System.out.println("INCORRECT DATA ENTERED! [TRY AGAIN]");
            CalculatorView.getNumbersToCalculate();
        }
    }
}
