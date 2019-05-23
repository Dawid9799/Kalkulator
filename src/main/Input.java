package main;

import java.util.Scanner;

public class Input {


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

    public static void getNumbersToCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WITAJ W KALKULATORZE!");
        System.out.print("Podaj pierwszą liczbę: ");
        firstUserNumber = scanner.nextLine();
        System.out.print("Podaj drugą liczbę: ");
        secondUserNumber = scanner.nextLine();
    }

    public static void checkTheGetNumbers() {
        try{
            checkFirstUserNumber = Double.valueOf(firstUserNumber);
            checkSecondUserNumber = Double.valueOf(secondUserNumber);
        }catch (NumberFormatException e){
            System.out.println("INCORRECT DATA ENTERED! [TRY AGAIN]");
            CalculatorView.getNumbersToCalculate();
        }

    }

}
