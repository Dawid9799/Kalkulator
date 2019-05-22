package main;

import java.util.Scanner;

public class CalculatorView extends CalculatorServer{


    Scanner scanner = new Scanner(System.in);

    private int choice;

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }


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
            setChoice(Integer.parseInt(choiceStr));
            validateMenuChocie(getChoice());
        }catch (NumberFormatException e){
            System.out.println("CHOOSE THE NUMBER FROM DROP 1-4");
            pickMenuItem();
        }

    }


    public void validateMenuChocie(int choice){
        this.setChoice(choice);
        if(getChoice() > 0 && getChoice() < 5) {}else {
            System.out.println("CHOOSE THE NUMBER FROM DROP 1-4");
            pickMenuItem();
        }
    }


    public void getNumbersToCalculate(){


        System.out.println("WITAJ W KALKULATORZE!");
        System.out.print("Podaj pierwszą liczbę: ");
        String xStr = scanner.nextLine();
        System.out.print("Podaj drugą liczbę: ");
        String yStr = scanner.nextLine();

        try{
            this.setX(Double.valueOf(xStr));
            this.setY(Double.valueOf(yStr));
        }catch (NumberFormatException e){
            System.out.println("INCORRECT DATA ENTERED! [TRY AGAIN]");
            getNumbersToCalculate();
        }

    }


    public void swithOperations(){

        switch (getChoice()){
            case 1:

                System.out.println("WYNIK: " + this.add());
                break;

            case 2:

                System.out.println("WYNIK: " + this.subtract());
                break;

            case 3:

                System.out.println("WYNIK: " + this.multiply());
                break;

            case 4:
                if (this.getY() != 0) {
                    System.out.println("WYNIK: " + this.divide());
                }else {
                        System.out.println("TOU MUSTN'T DIVIDE BY ZERO!!");
                    System.out.println("--------------------------------");
                    MainClass.main(null);
                }
                break;
        }
    }

}
