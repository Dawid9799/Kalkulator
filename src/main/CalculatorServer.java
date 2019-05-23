package main;

public class CalculatorServer {

    private double x;
    private double y;

    //pusty konstruktor tworzy sie automatycznie, nie trzeba go deklarować zeby użyc new CalculatorServer().
    // Spróbuj go usunąć i zobaczysz że program nadal będzie działać
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
        //zadanie z gwiazdką. Jak dzielę dwie liczby to dostaje wyniki w stylu 0.3242345345. Nie potrzebujemy tyle liczb po przecinku
        //trzeba będzie zrobić tak żeby wynik zaokrąglał się do 2 liczb po przecinku czyli np 0.32
        return x/y;
    }
}

