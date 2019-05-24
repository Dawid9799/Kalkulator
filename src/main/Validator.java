package main;

//kolejna klasa statyczna. takie klasy mozna nazwać helperami, ponieważ wykonują jakąś operację nie interesując się za bardzo całą resztą aplikacji
//ona tyko przyjmuje Stringa i sprawdza czy spełnia jakies wymagania
//równie dobrze tą klasę można byłoby wykorzystać do zupełnie innego projektu gdzie trzeba byłoby sprawdzić czy dany argument jest poprawny
public class Validator
{
    public static boolean isMenuOperationValid(String operation) {
        return isInputANumber(operation) && isInputBetweenRange(operation, 1, 4);
    }

    public static boolean isInputANumber(String operation) {
        try {
            Integer.parseInt(operation);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(String.format("%s is not a number!", operation));
        }
        return false;
    }

    public static boolean isInputBetweenRange(String operation, int min, int max) {
        int choiceNumber = Integer.parseInt(operation);
        if(choiceNumber < min || choiceNumber > max) {
            System.out.println(String.format("%s is not between 1-4!", operation));
            return false;
        }
        return true;
    }
}
