package main;

//typowa klasa bezstanowa - statyczna. Nic ją nie obchodzi co się dzieje w aplikacji
//dostaje dwie liczby i daje wynik
//uzywając tej samej metody kilka razy tymi samymi liczbami zawsze dostajemy ten sam wynik
//dzieki temu że jest statyczna, nie trzeba jej inicjalizować przez new CalculatorServer() tylko można od razu użyć
// CalculatorServer.add()
public class CalculatorServer {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return Math.round((num1/num2) * 100.0) / 100.0;
    }
}

