package main;


public class Calculator { //nazwałbym CalculatorServer - tutaj byłyby metody stricte związane z działaniami
    // matematycznymi


    public float x;
    public float y;


    //zrobiłbym tutaj konstruktor dla klasy calculator który przyjmowałby na starcie wartości x i y wtedy wtedy w
    // main będziesz wywoływać Calculator calculator = new Calculator(x,y)



    //stworzyłbym trzecią klasę o nazwie CalculatorView (odpowiedzialną za rzeczy związane z wyświetlananiem na
    // konsole. Miałaby takie metody jak printMenu() - do wyswietlenia menu, pickMenuItem() - do wybierania operacji
    // matematycznej getNumbersToCalculate() - do zebrania liczb do obliczeń
    public void Menu(){
        System.out.println("-----------------");
        System.out.println("------MENU-------");
        System.out.println("-----------------");
        System.out.println("1. DODAWANIE");
        System.out.println("2. ODEJMOWANIE");
        System.out.println("3. MNOŻENIE");
        System.out.println("4. DZIELENIE");
        System.out.println("-----------------");
    }



    public float add() {

        float z1 = x + y;

        return z1;
    }


    public float subtract() {

        float z2 = x - y;

        return z2;
    }


    public float multiply() {

        float z3 = x * y; // jak podaję liczbę w stylu sto biliardów razy biliard dostaję informację infinity zamiast
        // wyniku
        //czym to jest spowodowane? jesteśmy w stanie to jakoś wyłapać?
        return z3;
    }


    public float divide() {

        // float z4 = x / y; tutaj nie ma sensu przypisywać wyniku do zmiennej bo od razu chcemy ją przekazać. możesz
        // od razu zrobić: return x/y;

        return z4;
    }
}

