package main;

import java.util.Scanner;

//uu zła zagrywka, tak się nie stosuje dziedziczenia.
// Powinienes wywalić to extends i zobaczyć co się stanie :p. Trochę zmieni ci to program koncepcyjnie

public class CalculatorView extends CalculatorServer {

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
            pickMenuItem(); //super zagrywka :p o wiele lepsza niż nieskończone do/while i booleany
        }

    }

    public void validateMenuChocie(int choice){

        //gettery i settery używa się w innych klasach niż w tej gdzie dany argument jest zdefiniowany
        //tzn jak dobierasz się do chocie w klasie CalculatorView powinno to wyglądać po prostu
        // this.choice = choice. Słówko this odróżnia nam które choice jest które, to z this dotyczy zawsze tego
        //zdefiniowanego w klasie a ten bez tutaj tego z metody
        this.setChoice(choice);

        //znowu do choice można sie dobrać bezposrednio jako this.choice
        //zrobiłeś pustego ifa, tego unikamy jak ognia
        //możemy po prostu odwrócić sprawdzenie w ifie i wtedy nie będziemy potrzebować else tzn:
        // jeżeli choice jest mniejszy od zera lub większy od 5 to wyrzuć info - koniec :p
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
            //to nie będzie działać jak usuniesz extends
            // Ja zrobiłbym to tak że stworzyłbym klasę np Input która zawierałaby wartosci x i y
            // (albo firstUserNumber, secondUserNumber idąc konwencją mówiących coś nazw)
            //wtedy tutaj tworzyłbym taki obiekt jako new Input(x,y) i oddawałbym do na wyjściu z metody
            this.setX(Double.valueOf(xStr));
            this.setY(Double.valueOf(yStr));
        }catch (NumberFormatException e){
            System.out.println("INCORRECT DATA ENTERED! [TRY AGAIN]");
            getNumbersToCalculate();
        }
    }

    //switchOperations - nic mi ta nazwa nie mówi. Może lepiej byłoby np nazwać performCalculation()
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
