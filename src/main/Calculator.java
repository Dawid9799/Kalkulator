package main;


public class Calculator {


    public float x;
    public float y;


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

        float z3 = x * y;

        return z3;
    }


    public float divide() {

        float z4 = x / y;

        return z4;
    }
}

