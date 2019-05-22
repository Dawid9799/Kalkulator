package main;



import java.util.Scanner;


public class Kalkulator {        // klasę która zawiera metodę main nazwałbym MainClass a tą drugą Calculator.
    // ogólnie unikamy polskiego w kodzie

    public static void main(String[] srg){


        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();


        boolean a = true; // staramy się unikać nazw które nic nie mówią. dla booleanow zmienne nazywa się tak żeby
        // można było na nie odpowiedzieć true lub false np isEmpty (jezeli true to pusty jeżeli false to pełny), lub
        //hasMoreThanTwoLetters (jezeli true to ma więcej niż 2 litery). Nie ma też się co bać dłuższych nazw, lepiej
        // nazwa która coś mówi niż nic nie mówiąca litera :p tu np możesz użyć userPickedValidNumbers (true- uzytkownik
        // wybrał poprawne liczby, false nie wybrał


        //na czuja najpierw powinienem wybierać operację matematyczną a potem podawać co chcę zrobić :p
        do {
            System.out.println("WITAJ W KALKULATORZE!");
            System.out.print("Podaj pierwszą liczbę: ");
            String xx = sc.nextLine(); //nazwa zmiennej
            System.out.print("Podaj drugą liczbę: ");
            String yy = sc.nextLine(); //nazwa zmiennej

            try {
                calculator.x = Float.valueOf(xx); // ogarnij czym są gettery i settery https://www.youtube.com/watch?v=OF3vBYWikYs
                // spróbuj zrobić wartości x i y jako private. Jak już nauczysz się ręcznie je robić to później
                // pokaże ci skrót jak je się generuje automatycznie :p

                calculator.y = Float.valueOf(yy);
                a = false;
            } catch (Exception e) { //Exception to klasa matka wyjątków która wyłapie wszystko. Co zrobiłbyś w
                // sytuacji gdybyś chciał napisać różny komunikat w zależności od występującego błędu? Dlatego
                // powinno się wyłapywać wyjątek dokładnie ten który chcesz przechwycić, w twoim przypadku błąd
                // związany z przypisaniem Stringa do liczby czyli NumberFormatException

                System.out.println("WPROWADZONO BŁĘDNE DANE! Spróbuj jeszcze raz"); // po angielsku wszystko :D
                System.out.println("--------------------------------------------");
            }
        }while (a == true);


        calculator.Menu(); // konwencja jest taka ze metody zawsze powinny zaczynać się od małej litery i nie powinny
        // być rzeczownikami. Tutaj np możnaby było nazwać metodę .printMenu()


        boolean b = true; //nazwa zmiennej
        int choice = 0; // no widzisz potrafisz nazywać zmienne :D

        do {
            System.out.print(">>> ");
            String choice0 = sc.nextLine();

            try {
                choice = Integer.parseInt(choice0);


                // zawsze warto starać się wyrzucać pojedyńcze odpowiedzialnośći jak tą poniżej do osobnych metod
                //wtedy łatwiej się czyta taki kod niż jak wszystko jest w jednym worku (i łatwiej się pisze testy :))
                //moznaby zrobić metodę validateMenuChoice(choice) która będzie przyjmować wartość podaną przez
                // użytkownika. Dla ułatwienia powiem że ta metoda będzie musiała być statyczna czyli public static
                // void validateMenuChocie(int chocie). Temat statycznych metod jest trochę trudny, na razie spróbuj
                // sobie obejrzeć filmik, nie musisz jeszcze w 100% tego rozumieć https://www.youtube.com/watch?v=U3LHAyA0TRY
                // https://www.youtube.com/watch?v=s55jput6N1o . U ciebie trzeba zastosować static bo metoda startowa
                // main jest static. Jak popoprawiasz te rzeczy co ci wypiszę, pokażę ci jak tego uniknąć
                if (choice > 0 && choice < 5) {
                    b = false;
                } else {
                    System.out.println("NIE MA TAKIEJ OPERACJI W MENU!");
                }
                //*************************


            }catch (Exception e){ //podaj konkretny Exception
                System.out.println("NIE MA TAKIEJ OPERACJI W MENU!"); //wiadomość bardziej w stylu: wybierz liczbę
                // pomiędzy 1 a 4, żeby podpowiedzieć co zrobić
            }

        }while (b == true); // w takiej sytuacji nie musisz pisać b == true, można napisać poprostu b. wygląda to
        // dziwnie bo nazwa zmiennej jest nic nie mówiąca. Gdyby zmienna nazywała się np canSwim to czytałoby się to
        // w ten sposób: dopóki nie umie pływać, powtarzaj, gdy canSwim będzie true to wtedy koniec pętli



        float score; // a co to za dzika zmienna :p. zmienne deklarujemy na górze klasy, to ułatwia ich
        // zlokalizowanie. Gdyby ta klasa była 10x dłuższa, pewnie bym jej nie zauważył :p

        //cały switch możesz wyrzucić do osobnej metody żeby sama metoda main nie była taka duża. Metoda znowu będzie
        // musiała mieć słówko static i najlepiej żeby przyjmowała wartość choice jako parametr
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
