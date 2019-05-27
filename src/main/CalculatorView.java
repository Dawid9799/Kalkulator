package main;

import java.util.Scanner;

public class CalculatorView{

    static Scanner scanner = new Scanner(System.in);
    private int choice;

    public void printMenu(){
        System.out.println("-----------------");
        System.out.println("------MENU-------");
        System.out.println("-----------------");
        System.out.println("  1.   ADD");
        System.out.println("  2. SUBTRACT");
        System.out.println("  3. MULTIPLY");
        System.out.println("  4.  DIVIDE");
        System.out.println("-----------------");
    }

    public void pickMenuItem(){
        System.out.print(">>>");
        String choiceStr = scanner.nextLine();
        try {
            choice = Integer.parseInt(choiceStr);
            validateMenuChocie(choice);
        } catch (NumberFormatException e) {
            System.out.println("CHOOSE THE NUMBER FROM DROP 1-4");
            pickMenuItem();
        }
    }

    public void validateMenuChocie(int choice){
        this.choice = choice;
        if (choice < 1 || choice > 5) {
            System.out.println("CHOOSE THE NUMBER FROM DROP 1-4");
            pickMenuItem();
        }
    }

    public void printWelcome(){
        System.out.println("WELCOME TO THE CALCULATOR!");
    }

    public static void getFirstNumbersToCalculate(){
        System.out.print("Enter the first number: ");
        Input.checkFirstInputValues(scanner.nextLine());
    }

    public static void getSecondNumbersToCalculate(){
        System.out.print("Enter the second number: ");
        Input.checkSecondInputValues(scanner.nextLine());
    }


    public void performCalculation(){
        switch (choice) {
            case 1:
                System.out.println("SCORE: " + CalculatorServer.add());
                break;
            case 2:
                System.out.println("SCORE: " + CalculatorServer.subtract());
                break;
            case 3:
                System.out.println("SCORE: " + CalculatorServer.multiply());
                break;
            case 4:
                if (Input.getSecondUserNumber() != 0) {
                    CalculatorServer.divide();
                } else {
                    System.out.println("TOU MUSTN'T DIVIDE BY ZERO!!");
                    System.out.println("--------------------------------");
                    MainClass.main(null);
                }
                break;
        }
    }
}
