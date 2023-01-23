public class OperatoryMatematyczne {

    public static void main(String[] args){
        //int firstNumber = 4;
        //int secondNumber = 6;
        //float thirdNumber = 4.0F;
        int firstNumber, secondNumber;
                float thirdNumber;
            firstNumber = 4;
            secondNumber = 6;
            thirdNumber = 4.0F;
       int addition = firstNumber + secondNumber; //10
       int subtraction = firstNumber - secondNumber;//-2
       int multiplication = firstNumber * secondNumber;//24
       float division = thirdNumber / secondNumber;//aprox 0.66
       int modulo = secondNumber%firstNumber;  //reszta z dzielenia 6 w 4 mieści sie  1 i reszta 2


        Character add = '+' ;
        int result = firstNumber + secondNumber;


        /* System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynik odejmowania " + subtraction);
        System.out.println("Wynik mnożenia " + multiplication);
        System.out.println("wynik dzielenia " + division);
        System.out.println("Reszta z dzielenia modulo " + modulo);
        firstNumber+=secondNumber;
             */
        firstNumber+=secondNumber;
        System.out.println("Po dodaniu " + firstNumber);//10 nadpisanie zmiennej o wartości 4 nowym wynikiem czy 10 z tego działania 
        firstNumber-=secondNumber;
        System.out.println("Po odjęciu " + firstNumber);//4
        firstNumber*=secondNumber;
        System.out.println("Po mnożeniu " + firstNumber);//24
        firstNumber/=secondNumber;
        System.out.println("Po dzieleniu " + firstNumber);//4
        firstNumber%=secondNumber;
        System.out.println("Po modulo " + firstNumber);//4
    }
}
