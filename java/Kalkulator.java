import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe ");
        float firstNumber = scanner.nextFloat();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj drugą liczbe ");
        float secondNumber = scanner1.nextFloat();



        float add = firstNumber + secondNumber;
        System.out.println(" Wynik dodawania = " + add);

        float result1 = firstNumber - secondNumber;
        System.out.println(" Wynik odejmowania = " + result1);

        float result2 = firstNumber * secondNumber;
        System.out.println(" Wynik mnożenia = " + result2);

        float result3 = firstNumber / secondNumber;
        System.out.println(" Wynik dzielenia = " + result3);

        float result4 = firstNumber % secondNumber;
        System.out.println(" Reszta z dzielenia = " + result4);






    }
}
