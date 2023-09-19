import java.util.Scanner;
public class repaso_Parcial {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Ejercicio A

        System.out.println("Ingrese un primer número entero: ");
        int number1 = input.nextInt();

        System.out.println("Ingrese un segundo número entero: ");
        int number2 = input.nextInt();

        int last_Digit_1 = number1 % 10;
        int last_Digit_2 = number2 % 10;

        if (last_Digit_1 == last_Digit_2){
            System.out.println("La última cifra de " + number1 + " y " + number2 + " es la misma (" + last_Digit_1 + ").");
        } else {
            System.out.println("La última cifra de " + number1 + " y " + number2 + " no es la misma.");
        }

        //Ejercicio B

        System.out.println("Ingrese un número entero de tres cifras");
        int number = input.nextInt();

        if ((number > 999) || (number < -999)){
            while ((number > 999) || (number < -999)){
                System.out.println("Debe introducir un número entero de tres cifras");
                System.out.println("Ingrese un número entero de tres cifras");
                number = input.nextInt();
            }
        }

        int first_Digit = number / 100;
        int last_Digit = number % 10;

        if (first_Digit == last_Digit){
            System.out.println("El número " + number + " es capicúa");
        }else {
            System.out.println("El número " + number + " no es capicúa");
        }

        input.close();
    }
}
