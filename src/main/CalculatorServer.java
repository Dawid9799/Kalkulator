package main;

public class CalculatorServer{

    public static double add(){
        return Input.getFirstUserNumber() + Input.getSecondUserNumber();
    }

    public static double subtract(){
        return Input.getFirstUserNumber() - Input.getSecondUserNumber();
    }

    public static double multiply(){
        return Input.getFirstUserNumber() * Input.getSecondUserNumber();
    }

    public static void divide(){
        double exactScore = Input.getFirstUserNumber() / Input.getSecondUserNumber() * 100;
        double approximateScore = Math.round(exactScore);
        approximateScore /= 100;
        System.out.print(approximateScore);
    }
}

