import java.util.Arrays;
import java.util.Scanner;

public class Practica_Arrays_Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaración e inicialización

        //Ejercicio 1

        int [] array = new int[10];

        for (int i=0;i<=9;i++){
            array[i] = i + 1;
        }

        System.out.println("10 primeros números naturales");

        for (int i=0;i<=9;i++){
            System.out.println(array[i]);
        }

        //Ejercicio 2

        double [] array2 = new double[10];
        double n = 0;


        for (int i=0;i<=9;i++){
            while (true){
                if (((n % 2 != 0)) && ((n % 3 != 0)) && ((n % 5 != 0))){
                    array2[i] = n;
                    n += 1.0;
                    break;
                }
                n += 1.0;
            }
        }

        for (int i=0;i<=9;i++){
            System.out.println(array2[i]);
        }

        //Ejercicio 3

        int [][] array3 = new int[10][10];

        for (int i=0;i<=9;i++){
            for (int j=0;j<10;j++){
                array3[i][j] = j;
            }
        }

        System.out.println("Mostrando 10 veces los 10 primeros números naturales y cero");

        for (int i=0;i<=9;i++){
            for (int j=0;j<10;j++){
                System.out.println(array3[i][j]);
            }
        }

        //Ejercicio 4

        double [][][] array4 = new double[10][10][10];

        for (int i=0;i<=9;i++){
            for (int j=0;j<10;j++){
                for (int k=0;k<10;k++){
                    array4[i][j][k] = k;
                }
            }
        }

        System.out.println("Mostrando 100 veces los 10 primeros números naturales y cero");

        for (int i=0;i<=9;i++){
            for (int j=0;j<10;j++){
                for (int k=0;k<10;k++){
                    System.out.println(array4[i][j][k]);
                }
            }
        }

        //Lectura y escritura

        //Ejercicio 1

        int [] array5 = new int[10];

        for (int i=0;i<=9;i++){
            System.out.println("Ingrese un número");
            array5[i] = input.nextInt();
        }

        System.out.println("10 números enteros");

        for (int i=0;i<=9;i++){
            System.out.println(array5[i]);
        }

        //Ejercicio 2

        double [] array6 = new double[10];

        for (int i=0;i<=9;i++){
            System.out.println("Ingrese un número real");
            array6[i] = input.nextInt();
        }

        System.out.println("10 números reales");

        for (int i=0;i<=9;i++){
            System.out.println(array6[i]);
        }

        //Ejercicio 3

        String [] array7 = new String[10];

        for (int i=0;i<=9;i++){
            System.out.println("Ingrese un caracter");
            array7[i] = input.nextLine();
        }

        System.out.println("10 caracteres");

        for (int i=0;i<=9;i++){
            System.out.println(array7[i]);
        }

        //Ejercicio 4

        boolean [] array8 = new boolean[5];

        System.out.println("Introduzca 5 valores booleanos (true o false)");

        for (int i=0;i<5;i++){
            System.out.print((i+1) + "° valor: ");
            array8[i] = input.nextBoolean();
        }

        System.out.println("Mostrando array de booleanos");
        for (int i=0;i<5;i++){
            System.out.println(array8[i]);
        }

        //Operaciones aritméticas

        //Ejercicio 1

        int [] array9 = new int[10];
        int suma = 0;

        System.out.println("Ingrese 10 números enteros");

        for (int i=0;i<10;i++){
            System.out.print((i+1) + "° número: ");
            array9[i] = input.nextInt();
            suma += array9[i];
        }

        System.out.println("Suma de elementos: " + suma);

        //Ejercicio 2

        double [] array10 = new double[10];
        double producto = 1;

        System.out.println("Ingrese 10 números reales");

        for (int i=0;i<10;i++){
            System.out.print((i+1) + "° número: ");
            array10[i] = input.nextDouble();
            producto *= array10[i];
        }

        System.out.println("Multiplicación de elementos: " + producto);

        //Ejercicio 3

        int[] array11 = {5,2,6,1,4,7,8,9,10,3};
        int aux;

        System.out.print("Original: ");

        for (int i=0;i<10;i++){
            System.out.print(array11[i]);
        }


        for (int i=0;i<10-1;i++){
            for (int j=0;j<10-i-1;j++){
                if (array11[j] > array11[j+1]){
                    aux = array11[j+1];
                    array11[j+1] = array11[j];
                    array11[j] = aux;
                }
            }
        }

        System.out.println("\t");

        System.out.print("Ordenado: ");

        for (int i=0;i<10;i++){
            System.out.print(array11[i]);
        }

        //Ejercicio 4

        String[] array12 = {"enzo", "rudolfo", "max", "nachoman", "gualter", "messi", "milei", "bokita", "n-word", "dolarizacion"};

        System.out.print("Original: ");
        for (int i=0;i<10;i++){
            System.out.print(array12[i] + ", ");
        }

        System.out.println("\t");
        Arrays.sort(array12);

        System.out.print("Ordenado: ");
        for (int i=0;i<10;i++){
            System.out.print(array12[i] + ", ");
        }

        //Ejercicios adicionales

        //Ejercicio 1

        int [] array13 = new int[5];

        System.out.println("Ingrese 5 números enteros");
        for (int i=0;i<5;i++){
            System.out.print((i+1) + "° número: ");
            array13[i] = input.nextInt();
        }

        int contador = pares(array13);

        System.out.println("La cantidad de pares es: " + contador);

        //Ejercicio 2

        double[] array14 = new double[5];

        System.out.println("Ingrese 5 números reales");
        for (int i=0;i<5;i++){
            System.out.print((i+1) + "° número: ");
            array14[i] = input.nextDouble();
        }

        int contador2 = mayores(array14);

        System.out.println("La cantidad de mayores a 10 es: " + contador2);

        //Ejercicio 3

        int[] array15 = new int[5];

        System.out.println("Ingrese 5 números enteros");
        for (int i=0;i<5;i++){
            System.out.print((i+1) + "° número: ");
            array15[i] = input.nextInt();
        }

        int suma_Multiplos_3 = mayores(array15);

        System.out.println("Suma de múltiplos de 3: " + suma_Multiplos_3);

        //Ejercicio 4

        int[] array16 = new int[5];

        System.out.println("Ingrese 5 números enteros");
        for (int i=0;i<5;i++){
            System.out.print((i+1) + "° número: ");
            array16[i] = input.nextInt();
        }

        int maximo_Numero = maximo(array16);

        System.out.println("Máximo: " + maximo_Numero);

        //Ejercicio 5

        String[] array17 = new String[5];

        System.out.println("Ingrese 5 palabras");
        for (int i=0;i<5;i++){
            System.out.print((i+1) + "° palabra: ");
            array17[i] = input.nextLine();
        }

        String minima_Palabra = minima(array17);

        System.out.println("Mínima: " + minima_Palabra);

        //Ejercicio 6

        int[] array18 = new int[5];

        System.out.println("Ingrese 5 números enteros");
        for (int i=0;i<5;i++){
            System.out.print((i+1) + "° número: ");
            array18[i] = input.nextInt();
        }

        int[] copiar_Array = copia(array18);

        System.out.print("Arreglo A: ");
        for (int i=0;i<5;i++){
            System.out.print(copiar_Array[i]);
        }

        System.out.println("\t");

        System.out.print("Arreglo copiado: ");
        for (int i=0;i<5;i++){
            System.out.print(copiar_Array[i]);
        }

        input.close();
    }

    //Método ejercicio 1
    public static int pares(int[] array){
        int pair_Counter = 0;
        for (int i=0;i<5;i++){
            if (array[i] % 2 == 0){
                pair_Counter += 1;
            }
        }
        return pair_Counter;
    }

    //Método ejercicio 2
    public static int mayores(double[] array) {
        int major_Counter = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i] > 10) {
                major_Counter += 1;
            }
        }
        return major_Counter;
    }

    //Método ejercicio 3
    public static int mayores(int[] array){
        int suma = 0;
        for (int i=0;i<5;i++){
            if (array[i] % 3 == 0){
                suma += array[i];
            }
        }
        return suma;
    }

    //Método ejercicio 4
    public static int maximo(int[] array){
        int max = 0;
        for (int i=0;i<5-i;i++){
            if (array[i+1] > array[i]){
                max = array[i+1];
            }
        }
        return max;
    }

    //Método ejercicio 5
    public static String minima(String[] array){
        String min = null;
        for (int i=0;i<5-i;i++){
            if (array[i].length() < array[i+1].length()){
                min = array[i];
            }
        }
        return min;
    }

    //Método ejercicio 6
    public static int[] copia(int[] array){
        int[] array_Aux = new int[5];
        System.arraycopy(array,0,array_Aux,0,array.length);
        return array_Aux;
    }
}

