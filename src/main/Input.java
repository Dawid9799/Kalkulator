package main;


public class Input{

    private static double firstUserNumber;
    private static double secondUserNumber;

    public static double getFirstUserNumber(){
        return firstUserNumber;
    }

    public static double getSecondUserNumber(){
        return secondUserNumber;
    }

    public static void checkFirstInputValues(String checkInputValues){
        try {
            firstUserNumber = Double.valueOf(checkInputValues);
        } catch (NumberFormatException e) {
            System.out.println("INCORRECT DATA ENTERED! [TRY AGAIN]");
            CalculatorView.getFirstNumbersToCalculate();
        }
    }

    public static void checkSecondInputValues(String checkInputValues){
        try {
            secondUserNumber = Double.valueOf(checkInputValues);
        }catch (NumberFormatException e) {
            System.out.println("INCORRECT DATA ENTERED! [TRY AGAIN]");
            CalculatorView.getSecondNumbersToCalculate();
        }
    }
}

