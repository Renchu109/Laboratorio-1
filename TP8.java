import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        //Trabajo Práctico 8

        System.out.println("Ejercicio 1 \n");
        ejercicio1();
        System.out.println("Ejercicio 2 \n");
        ejercicio2();
        System.out.println("Ejercicio 3 \n");
        ejercicio3();
        System.out.println("Ejercicio 4 \n");
        ejercicio4();
        System.out.println("Ejercicio 5 \n");
        ejercicio5();
        System.out.println("Ejercicio 6 \n");
        ejercicio6();
        System.out.println("Ejercicio 7 \n");
        ejercicio7();
        System.out.println("Ejercicio 8 \n");
        ejercicio8();
        System.out.println("Ejercicio 9 \n");
        ejercicio9();
        System.out.println("Ejercicio 10 \n");
        ejercicio10();
        System.out.println("Ejercicio 11 \n");
        ejercicio11();
        System.out.println("Ejercicio 12 \n");
        ejercicio12();
        System.out.println("Ejercicio 13 \n");
        ejercicio13();
        System.out.println("Ejercicio 14 \n");
        ejercicio14();
        System.out.println("Ejercicio 15 \n");
        ejercicio15();
        System.out.println("Ejercicio 16 \n");
        ejercicio16();
        System.out.println("Ejercicio 17 \n");
        ejercicio17();
        System.out.println("Ejercicio 18 \n");
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};

        int[][] result = multiplyMatrices(matrixA, matrixB);

        if (result != null) {
            System.out.println("Resultado de la multiplicación:");
            printMatrix(result);
        }
    }
    public static void ejercicio1(){

        int[][] matrix1 = {{4,8,6},{6,2,8},{7,9,4}};
        int[][] matrix2 = {{1,9,4},{7,3,6},{8,7,5}};


        System.out.println("Matriz 1");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz 2");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz1 + matriz 2");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print((matrix2[i][j] + matrix1[i][j]) + " ");
            }
            System.out.println();
        }
    }
    public static void ejercicio2(){

        int[][] matrix1 = {{4,8,6},{6,2,8},{7,9,4}};
        int[][] matrix2 = {{1,9,4},{7,3,6},{8,7,5}};


        System.out.println("Matriz 1");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz 2");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz1 x matriz 2");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print((matrix2[i][j] * matrix1[i][j]) + " ");
            }
            System.out.println();
        }
    }
    public static void ejercicio3(){

        int[][] matrix1 = {{4,8,6},{6,2,8},{7,9,4}};
        int[][] matrix2 = {{1,9,4},{7,3,6},{8,7,5}};


        System.out.println("Matriz 1");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz1 transpuesta");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix1[j][i]  + " ");
            }
            System.out.println();
        }
    }
    public static void ejercicio4(){

        int[][] matrix1 = {{4,8,6},{6,2,8},{7,9,4}};
        int[][] matrix2 = {{1,9,4},{7,3,6},{8,7,5}};
        int[][] matrix3 = {{1,0},{0,1}};
        boolean bool = true;


        System.out.println("Matriz 1");
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                bool = matrix3[i][j] == matrix1[j][i];
            }
        }

        if (!bool){
            System.out.println("La matriz es simétrica");
        }else {
            System.out.println("La matriz no es simétrica");
        }
    }
    public static void ejercicio5(){
        Scanner scan = new Scanner(System.in);

        int[][] matrix1 = {{4,8,6},{6,2,8},{7,9,4}};
        int[][] matrix2 = {{1,9,4},{7,3,6},{8,7,5}};
        int[][] matrix3 = {{1,0},{0,1}};
        int[] vector1 = {1,4,9,5,3};

        System.out.println("Vector");
        for (int i=0;i<5;i++){
            System.out.println(vector1[i]);
        }

        System.out.print("Número para hacer el producto escalar: ");
        int n = scan.nextInt();

        System.out.println("Vector producto escalar con " + n);
        for (int i=0;i<5;i++){
            System.out.println(vector1[i] * n);
        }

        scan.close();
    }
    public static void ejercicio6(){

        int[][] matrix1 = {{4,8,6},{6,2,8},{7,9,4}};
        int[][] matrix2 = {{1,9,4},{7,3,6},{8,7,5}};
        int[][] matrix3 = {{1,0},{0,1}};
        int sum = 0;

        System.out.println("Matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                sum += matrix1[i][j];
            }
        }
        System.out.println("Suma de elementos: " + sum);
    }
    public static void ejercicio7(){

        int[][] matrix1 = {{4,8,6},{6,2,8},{7,9,4}};
        int[][] matrix2 = {{1,9,4},{7,3,6},{8,7,5}};
        int[][] matrix3 = {{1,0},{0,1}};
        int max = 0;
        int pos_Fila = 0;
        int pos_Col = 0;

        System.out.println("Matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (matrix2[i][j] > max){
                    max = matrix2[i][j];
                    pos_Fila = i;
                    pos_Col = j;
                }
            }
        }

        System.out.println("Elemento máximo: "+ max);
        System.out.println("Posición: fila " + pos_Fila + ", columna " + pos_Col);
    }
    public static void ejercicio8(){
        Scanner scan = new Scanner(System.in);

        int[][] matrix1 = {{4,8,6},{6,2,8},{7,9,4}};
        int[][] matrix2 = {{1,9,4},{7,3,6},{8,7,5}};
        int[][] matrix3 = {{1,0},{0,1}};
        int sum = 0;

        System.out.println("Matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Elija la fila a sumar (Empieza en la 0): ");
        int fila = scan.nextInt();
        if ((fila < 0) || (fila>2)){
            while ((fila < 0) || (fila>2)){
                System.out.print("Elija una fila desde la 0 hasta la 2");
                fila = scan.nextInt();
            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (i == fila){
                    sum += matrix2[i][j];
                }
            }
        }

        System.out.println("Elemento de la fila "+ fila + " sumados: " + sum);

        scan.close();
    }
    public static void ejercicio9(){

        int[][] matrix1 = {{4,8,6},{6,2,8},{7,9,4}};
        int[][] matrix2 = {{1,9,4},{7,3,6},{8,7,5}};
        int[][] matrix3 = {{1,0,0},{0,7,0},{0,0,6}};
        boolean bool = true;

        System.out.println("Matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (i != j){
                    bool = matrix3[i][j] == 0;
                }
            }
        }

        if (bool){
            System.out.println("La matriz es diagonal");
        }else {
            System.out.println("La matriz no es diagonal");
        }
    }
    public static void ejercicio10(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamanio = scan.nextInt();

        int[][] matrix = new int[tamanio][tamanio];

        for (int i=0;i<tamanio;i++){
            for (int j=0;j<tamanio;j++){
                if (i == j){
                    matrix[i][j] = 1;
                }else {
                    matrix[i][j] = 0;
                }
            }
        }


        System.out.println("Matriz identidad de tamanño " + tamanio + "x" + tamanio);
        for (int i=0;i<tamanio;i++){
            for (int j=0;j<tamanio;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        scan.close();
    }
    public static void ejercicio11(){

        int[][] matrix = {{7,4,8},{6,5,9},{2,4,5}};
        int pares = 0;
        int impares = 0;

        System.out.println("Matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println(
            );
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (matrix[i][j] % 2 == 0){
                    pares += 1;
                }else {
                    impares += 1;
                }
            }
        }

        System.out.println("Cantidad de elementos pares: " + pares);
        System.out.println("Cantidad de elementos impares: " + impares);
    }
    public static void ejercicio12(){
        int[][] matrix = {{7,4,8},{6,5,9},{2,4,5}};

        System.out.println("Matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Matriz rotada");
        for (int i=0;i<3;i++){
            for (int j=2;j>=0;j--){
                System.out.print(matrix[j][i] + "  ");
            }
            System.out.println();
        }
    }
    public static void ejercicio13(){
        Scanner scan = new Scanner(System.in);

        int[][] matrix = {{7,4,8},{6,5,9},{2,4,5}};
        int cont = 0;

        System.out.println("Matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.print("Ingrese el valor que desea contar: ");
        int n = scan.nextInt();

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (matrix[i][j] == n){
                    cont += 1;
                }
            }
        }

        System.out.println("Cantidad de veces que aparece " + n + ": " + cont);

        scan.close();
    }
    public static void ejercicio14(){

        int[][] matrix = {{7,4,8},{6,5,9},{2,4,5}};

        System.out.println("Matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Matriz con filas invertidas");
        for (int i=2;i>=0;i--){
            for (int j=0;j<3;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void ejercicio15(){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[][] matrix = new int[3][3];
        int sum = 0;

        System.out.println("Matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                int n = random.nextInt(10);
                matrix[i][j] = n;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Suma diagonal 1: " + matrix[2][0]);
        System.out.println("Suma diagonal 2: " + (matrix[1][0] + matrix[2][1]));
        System.out.println("Suma diagonal 3: " + (matrix[0][0] + matrix[1][1] + matrix[2][2]));
        System.out.println("Suma diagonal 4: " + (matrix[0][1] + matrix[1][2]));
        System.out.println("Suma diagonal 5: " + matrix[0][2]);

        scan.close();
    }
    public static void ejercicio16(){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamanio = scan.nextInt();

        int[][] matrix = new int[tamanio][tamanio];
        boolean bool = true;

        System.out.println("Matriz");
        for (int i=0;i<tamanio;i++){
            for (int j=0;j<tamanio;j++){
                int n = random.nextInt(10)-5;
                matrix[i][j] = n;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Transpuesta");
        for (int i=0;i<tamanio;i++){
            for (int j=0;j<tamanio;j++){
                System.out.print(matrix[j][i] + "  ");
            }
            System.out.println();
        }

        System.out.println("Inversa");
        for (int i=0;i<tamanio;i++){
            for (int j=0;j<tamanio;j++){
                System.out.print((matrix[j][i] * (-1)) + "  ");
            }
            System.out.println();
        }

        System.out.println("¿Ortogonal?");
        for (int i=0;i<tamanio;i++){
            for (int j=0;j<tamanio;j++){
                bool = ((matrix[j][i]) == (matrix[j][i] * (-1)));
            }
        }

        if (!bool){
            System.out.println("La matriz no es ortogonal");
        }else {
            System.out.println("La matriz es ortogonal");
        }

        scan.close();
    }
    public static void ejercicio17(){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamanio = scan.nextInt();

        int[][] matrix = new int[tamanio][tamanio];
        int[] vector = new int[tamanio];
        int min = 5;

        System.out.println("Matriz");
        for (int i=0;i<tamanio;i++){
            for (int j=0;j<tamanio;j++){
                int n = random.nextInt(10)-5;
                matrix[i][j] = n;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i =0;i<tamanio;i++){
            for (int j=0;j<tamanio;j++){
                if ((matrix[i][j]) < min){
                    min = matrix[i][j];
                }
            }
            vector[i] = min;
            min = 5;
        }

        for (int i=0;i<tamanio;i++){
            System.out.println("El valor mínimo de la fila " + i + " es " + vector[i]);
        }
        scan.close();
    }

    //Funciones ejercicio 18
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        // Verifica si la multiplicación es posible
        if (colsA != rowsB) {
            System.out.println("No se puede multiplicar. El número de columnas de la matriz A debe ser igual al número de filas de la matriz B.");
            return null;
        }

        // Crea una matriz para almacenar el resultado
        int[][] result = new int[rowsA][colsB];

        // Realiza la multiplicación de matrices
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}