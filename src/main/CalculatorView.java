package main;

import java.util.Scanner;


public class CalculatorView {

    Scanner scanner = new Scanner(System.in);
    private int choice;

    public void printMenu(){
        System.out.println("-----------------");
        System.out.println("------MENU-------");
        System.out.println("-----------------");
        System.out.println("1. DODAWANIE");
        System.out.println("2. ODEJMOWANIE");
        System.out.println("3. MNOŻENIE");
        System.out.println("4. DZIELENIE");
        System.out.println("-----------------");
    }

    public void pickMenuItem(){
        System.out.print(">>>");
        String choiceStr = scanner.nextLine();

        try{
            choice = Integer.parseInt(choiceStr);
            validateMenuChocie(choice);
        }catch (NumberFormatException e){
            System.out.println("CHOOSE THE NUMBER FROM DROP 1-4");
            pickMenuItem();
        }
    }

    public void validateMenuChocie(int choice){

        this.choice = choice;

        if(choice < 0 && choice > 5) {   //nwm czemu ale z samym if-em nie chce to działać
            System.out.println("CHOOSE THE NUMBER FROM DROP 1-4");
            pickMenuItem();
        }
    }

    public static void getNumbersToCalculate(){
        Input.getNumbersToCheck();
        Input.checkTheGetNumbers();
    }

    public void performCalculation(){
        switch (choice){
            case 1:
                System.out.println("WYNIK: " + CalculatorServer.add());
                break;

            case 2:
                System.out.println("WYNIK: " + CalculatorServer.subtract());
                break;

            case 3:
                System.out.println("WYNIK: " + CalculatorServer.multiply());
                break;

            case 4:
                if (Input.getCheckSecondUserNumber() != 0) {
                    CalculatorServer.divide();
                }else {
                    System.out.println("TOU MUSTN'T DIVIDE BY ZERO!!");
                    System.out.println("--------------------------------");
                    MainClass.main(null);
                }
                break;
        }
    }
}
