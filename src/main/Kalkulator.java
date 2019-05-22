package main;



import java.util.Scanner;


public class Kalkulator {

    public static void main(String[] srg){


        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();


        boolean a = true;

        do {
            System.out.println("WITAJ W KALKULATORZE!");
            System.out.print("Podaj pierwszą liczbę: ");
            String xx = sc.nextLine();
            System.out.print("Podaj drugą liczbę: ");
            String yy = sc.nextLine();

            try {
                calculator.x = Float.valueOf(xx);
                calculator.y = Float.valueOf(yy);
                a = false;
            } catch (Exception e) {
                System.out.println("WPROWADZONO BŁĘDNE DANE! Spróbuj jeszcze raz");
                System.out.println("--------------------------------------------");
            }
        }while (a == true);


        calculator.Menu();


        boolean b = true;
        int choice = 0;

        do {
            System.out.print(">>> ");
            String choice0 = sc.nextLine();

            try {
                choice = Integer.parseInt(choice0);

                if (choice > 0 && choice < 5) {
                    b = false;
                } else {
                    System.out.println("NIE MA TAKIEJ OPERACJI W MENU!");
                }

            }catch (Exception e){
                System.out.println("NIE MA TAKIEJ OPERACJI W MENU!");
            }

        }while (b == true);



        float score;

        switch (choice){
            case 1:
                score = calculator.add();
                System.out.println("WYNIK: " + score);
                break;

            case 2:
                score = calculator.subtract();
                System.out.println("WYNIK: " + score);
                break;

            case 3:
                score = calculator.multiply();
                System.out.println("WYNIK: " + score);
                break;

            case 4:
                if (calculator.y != 0) {
                    score = calculator.divide();
                    System.out.println("WYNIK: " + score);
                }else {
                    System.out.println("NIE DZIELI SIĘ PRZEZ ZERO!!");
                    System.out.println("---------------------------");
                    main(null);
                }
                break;
        }

    }

}
