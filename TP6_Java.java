import java.util.Random;
import java.util.Scanner;

public class TP6 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //Ejercicio 1

        int [] array = new int[10];
        int i;
        int positives = 0;
        int count_Positives = 0;
        int negatives = 0;
        int count_Negatives = 0;

        System.out.println("Ingrese 10 números");

        for (i = 0;i <= 9; i++){
            System.out.println("Ingrese un " + (i + 1)+ "° número: ");
            array[i] = input.nextInt();
            if (array[i] > 0){
                positives += array[i];
                count_Positives += 1;
            } else if (array[i] < 0) {
                negatives += array[i];
                count_Negatives += 1;
            }
        }

        System.out.println("Media positivos: " + (positives / count_Positives));

        if (negatives < 0){
            System.out.println("Media negativos: " + (negatives / count_Negatives));
        }

        //Ejercicio 2

        int [] array2 = new int[10];
        int pair_Counter = 0;
        int pair = 0;

        System.out.println("Ingrese 10 números");

        for (i = 0; i <= 9; i++){
            System.out.println("Ingrese el " + (i+1) + "° número: ");
            array2[i] = input.nextInt();
            if (i % 2 == 0){
                pair_Counter += 1;
                pair += array2[i];
            }
        }

        System.out.println("Media de los números en posiciones pares: " + (pair / pair_Counter));

        //Ejercicio 3

        System.out.println("Introduzca el número de alumnos del curso: ");
        int students = input.nextInt();
        double [] array3 = new double[students];
        int note_Counter = 0;
        double notes = 0;

        for (i = 0; i <= (students - 1); i++){
            System.out.println("Ingrese la nota del " + (i+1) + "° estudiante: ");
            array3[i] = input.nextDouble();
            if ((array3[i] < 0) || (array3[i] > 10)){
                while ((array3[i] < 0) || (array3[i] > 10)){
                    System.out.println("La nota debe ser un valor real entre 0 y 10");
                    System.out.println("Ingrese la nota del " + (i+1) + "° estudiante: ");
                    array3[i] = input.nextDouble();
                }
            }
        }

        for (i = 0; i<= (students - 1); i++){
            notes += array3[i];
            note_Counter += 1;
        }

        System.out.println("Nota media del grupo: " + (notes / note_Counter));

        System.out.println("Alumnos con notas superiores a la media");

        for (i = 0; i<= (students - 1); i++){
            if (array3[i] > (notes / note_Counter)){
                System.out.println("Alumno n°" + (i+1) + " (" + array3[i] + ")");
            }
        }

        //Ejercicio 4

        int [] pares = new int[20];
        int count = 0;

        for (i = 0; i<= 19; i++){
            pares[i] = count;
            count += 2;
        }

        System.out.println("20 primeros números pares");

        for (i = 0; i <= 19; i++){
            System.out.println(pares[i]);
        }

        //Ejercicio 5

        int [] array4 = new int[10];
        positives = 0;
        negatives = 0;
        int nulls = 0;

        System.out.println("Ingrese 10 números");

        for (i = 0; i <= 9; i++){
            System.out.println("Ingrese el " + (i+1) + "° número: ");
            array4[i] = input.nextInt();
        }

        for (i = 0; i <= 9; i++){
            if (array4[i] > 0){
                positives += 1;
            } else if (array4[i] < 0) {
                negatives += 1;
            }else {
                nulls += 1;
            }
        }

        System.out.println("Positivos: " + positives);
        System.out.println("Negativos: " + negatives);
        System.out.println("Nulos: " + nulls);

        //Ejercicio 6

        int [] array5 = new int[10];
        positives = 0;
        int positive_Counter = 0;
        negatives = 0;
        int negative_Counter = 0;

        System.out.println("Ingrese 10 números");

        for (i = 0; i <= 9; i++){
            System.out.println("Ingrese el " + (i+1) + "° número: ");
            array5[i] = input.nextInt();
        }

        for (i = 0; i <= 9; i++){
            if (array5[i] > 0){
                positives += array5[i];
                positive_Counter += 1;
            } else if (array5[i] < 0) {
                negatives += array5[i];
                negative_Counter += 1;
            }
        }

        System.out.println("Media de positivos: " + (positives / positive_Counter));
        System.out.println("Media de negativos: " + (negatives / negative_Counter));

        //Ejercicio 7

        System.out.println("Ingrese el número de personas a medir: ");
        int people = input.nextInt();
        double [] array_People = new double[people];
        double heights = 0;
        int height_Counter = 0;
        int tall_People_Counter = 0;
        int short_People_Counter = 0;

        System.out.println("Altura de " + people + " personas en metros");

        for (i = 0;i <= (people-1); i++){
            System.out.println((i+1) + "° persona: ");
            array_People[i] = input.nextDouble();
            if (array_People[i] <= 0){
                while (array_People[i] <= 0){
                    System.out.println("Debe introducir una altura válida");
                    System.out.println((i+1) + "° persona: ");
                    array_People[i] = input.nextDouble();
                }
            }
            heights += array_People[i];
            height_Counter += 1;
        }

        System.out.println("Altura media: " + (heights / height_Counter));

        System.out.println(" ");

        for (i=0;i<=(people-1);i++){
            if ((array_People[i]) > (heights / height_Counter)){
                tall_People_Counter += 1;
            }else {
                short_People_Counter += 1;
            }
        }

        System.out.println("Personas altas: " + tall_People_Counter);

        for (i=0;i<=(people-1);i++){
            if (array_People[i] > (heights / height_Counter)){
                System.out.println("Persona n° " + (i+1) + " (" + array_People[i] + ")");
            }
        }

        System.out.println(" ");

        System.out.println("Personas bajas: " + short_People_Counter);

        for (i=0;i<=(people-1);i++){
            if (array_People[i] < (heights / height_Counter)){
                System.out.println("Persona n° " + (i+1) + " (" + array_People[i] + ")");
            }
        }

        //Ejercicio 8

        String [] array_Nombres = new String[20];
        int [] array_Sueldos = new int[20];

        for (i=0;i<=19;i++){
            System.out.println("Nombre del " + (i+1) + "° empleado: ");
            array_Nombres[i] = input.next();
            System.out.println("Sueldo de " + array_Nombres[i]);
            array_Sueldos[i] = input.nextInt();
        }

        int biggest_Salary = array_Sueldos[0];

        for (i=0;i<=19;i++){
            if (array_Sueldos[i] > biggest_Salary){
                biggest_Salary = array_Sueldos[i];
            }
        }

        for (i=0;i<=19;i++){
            if (array_Sueldos[i] == biggest_Salary){
                System.out.println("La persona que mas cobra es " + array_Nombres[i] + ". Sueldo: $" + array_Sueldos[i]);
                break;
            }
        }

        //Ejercicio 9

        System.out.println("Tamaño del arreglo: ");
        int size = input.nextInt();

        int [] array6 = new int[size];

        for (i=0;i<=(size-1);i++){
            array6[i] = random.nextInt(100 - 1 + 1) + 1;
            System.out.println((i+1) + "° número: " + array6[i]);
        }

        //Ejercicio 10
        //Parte A

        System.out.println("Ingrese el número de FILAS de las matrices: ");
        int rows = input.nextInt();

        System.out.println("Ingrese el número de COLUMNAS de las matrices: ");
        int columns = input.nextInt();

        int [][] matrix_A = new int[rows][columns];
        int [][] matrix_B = new int[rows][columns];
        int [][] matrix_C = new int[rows][columns];
        int j;

        System.out.println("Ingrese los valores de la matriz A");

        for (i=0;i<=(rows-1);i++){
            for (j=0;j<=(columns-1);j++){
                System.out.println("fila: " + (i+1) + ". Columna: " + (j+1));
                matrix_A[i][j] = input.nextInt();
            }
        }

        System.out.println("Ingrese los valores de la matriz B");

        for (i=0;i<=(rows-1);i++){
            for (j=0;j<=(columns-1);j++){
                System.out.println("fila: " + (i+1) + ". Columna: " + (j+1));
                matrix_B[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriz A");

        for (i=0;i<=(rows-1);i++){
            for (j=0;j<=(columns-1);j++){
                System.out.print(matrix_A[i][j]);
            }
            System.out.println("\t");
        }

        System.out.println("Matriz B");

        for (i=0;i<=(rows-1);i++){
            for (j=0;j<=(columns-1);j++){
                System.out.print(matrix_B[i][j]);
            }
            System.out.println("\t");
        }

        System.out.println("Matriz C (A+B)");

        for (i=0;i<=(rows-1);i++){
            for (j=0;j<=(columns-1);j++){
                matrix_C[i][j] = matrix_A[i][j] + matrix_B[i][j];
            }
        }

        for (i=0;i<=(rows-1);i++){
            for (j=0;j<=(columns-1);j++){
                System.out.print(matrix_C[i][j]);
            }
            System.out.println("\t");
        }

        //Parte B

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de filas de las matrices:");
        int filas = leerEntero(scanner);
        System.out.println("Introduce el número de columnas de las matrices:");
        int columnas = leerEntero(scanner);

        int[][] matriz1 = crearMatriz(filas, columnas);
        int[][] matriz2 = crearMatriz(filas, columnas);

        System.out.println("Introduce los valores de la primera matriz:");
        llenarMatriz(matriz1, scanner);
        System.out.println("Introduce los valores de la segunda matriz:");
        llenarMatriz(matriz2, scanner);

        System.out.println("Matriz 1:");
        mostrarMatriz(matriz1);

        System.out.println("Matriz 2:");
        mostrarMatriz(matriz2);

        int[][] resultado = sumarMatrices(matriz1, matriz2);

        System.out.println("Resultado de la suma:");
        mostrarMatriz(resultado);

        //Ejercicio 11

        System.out.println("Ingrese el número de FILAS de la matriz: ");
        rows = input.nextInt();

        System.out.println("Ingrese el número de COLUMNAS de la matriz: ");
        columns = input.nextInt();

        int [][] matrix = new int[rows][columns];

        System.out.println("Ingrese los valores de la matriz");

        for (i=0;i<=(rows-1);i++){
            for(j=0;j<=(columns-1);j++){
                System.out.println("Fila " + (i+1) + ". Columna: " + (j+1));
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriz");

        for (i=0;i<=(rows-1);i++){
            for(j=0;j<=(columns-1);j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("\t");
        }

        System.out.println("Matriz transpuesta");

        for (i=0;i<=(rows-1);i++){
            for(j=0;j<=(columns-1);j++){
                System.out.print(matrix[j][i]);
            }
            System.out.println("\t");
        }

        input.close();

    }

    public static int leerEntero(Scanner scanner) {
        return scanner.nextInt();
    }

    public static int[][] crearMatriz(int filas, int columnas) {
        return new int[filas][columnas];
    }

    public static void llenarMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor en la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                matriz[i][j] = leerEntero(scanner);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }
}