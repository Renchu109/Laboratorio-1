import java.util.Scanner;

public class repaso_Parcial{
    public static void main(String[] args){

        Scanner input =  new Scanner(System.in);

        //Ejercicio 1: Programa Java para determinar si la última cifra de dos números enteros es la misma

        System.out.println("Ingrese un primer número entero: ");
        int number1 = input.nextInt();

        System.out.println("Ingrese un segundo número entero: ");
        int number2 = input.nextInt();

        int last_Digit_1 = number1 % 10;
        int last_Digit_2 = number2 % 10;

        if (last_Digit_1 == last_Digit_2){
            System.out.println("La última cifra de los números " + number1 + " y " + number2 + " es la misma");
        }else{
            System.out.println("La última cifra de los números " + number1 + " y " + number2 + " no es la misma");
        }

        //Ejercicio 2: Programa Java para determinar si un número de tres cifras es o no capicúa

        System.out.println("Ingrese un número entero de 3 cifras: ");
        int number = input.nextInt();

        if ((number < 100) || (number > 999)){
            System.out.println("Error: El número debía ser de 3 cifras");
        }else  {
            int first_Digit =  (number / 100);
            int last_Digit = (number % 10);

            if (first_Digit == last_Digit){
                System.out.println("El número " + number + " es capicúa");
            }else {
                System.out.println("El número " + number + " no es capicúa");
            }
        }

        input.close();

    }
}