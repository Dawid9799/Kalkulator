package main;

public class CalculatorServer {

    public static double add() {
        return Input.getCheckFirstUserNumber() + Input.getCheckSecondUserNumber();

    }

    public static double subtract() {
        return Input.getCheckFirstUserNumber() - Input.getCheckSecondUserNumber();
    }

    public static double multiply() {
        return Input.getCheckFirstUserNumber() * Input.getCheckSecondUserNumber();
    }

    public static void divide() {
        double approximateScore = Input.getCheckFirstUserNumber() / Input.getCheckSecondUserNumber();
        approximateScore *= 100;
        approximateScore = Math.round(approximateScore);
        approximateScore /= 100;
        System.out.print(approximateScore);
    }
}

