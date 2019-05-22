package main;


public class CalculatorServer {

    private double x;
    private double y;

    CalculatorServer(){}


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double add() {
        return x + y;
    }

    public double subtract() {
        return x - y;
    }

    public double multiply() {
        return x * y;
    }

    public double divide() {
        return x/y;
    }
}

