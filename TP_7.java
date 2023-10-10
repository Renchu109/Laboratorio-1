import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class TP7_Java {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Ejercicio 1

        int[] array = {1,5,4,8,7,6,9,3,2,0};

        Arrays.sort(array);

        for (int i: array){
            System.out.print(i);
        }

        //Ejercicio 2

        Integer[] array2 = {1, 5, 4, 8, 7, 6, 9, 3, 2, 0};

        Arrays.sort(array2, Collections.reverseOrder());

        for (int i: array2){
            System.out.print(i);
        }

        //Ejercicio 3

        double[] array3 = {1.4, 5.7, 6.1, 4.2, 1.3, 8.5, 4.1, 5.6, 7.3, 9.4};

        Arrays.sort(array3);

        for (double i: array3){
            System.out.print(i + ", ");
        }

        //Ejercicio 4

        Double[] array4 = {1.4, 5.7, 6.1, 4.2, 1.3, 8.5, 4.1, 5.6, 7.3, 9.4};

        Arrays.sort(array4, Collections.reverseOrder());

        for (double i: array4){
            System.out.print(i + ", ");
        }

        //Ejercicio 5

        String[] array5 = {"enzo", "rudolfo", "max", "nachoman", "gualter", "messi", "milei", "bokita"};

        Arrays.sort(array5);

        for (String i: array5){
            System.out.print(i + ", ");
        }

        //Ejercicio 6

        String[] array6 = {"enzo", "rudolfo", "max", "nachoman", "gualter", "messi", "milei", "bokita"};

        Arrays.sort(array6, Collections.reverseOrder());

        for (String i: array6){
            System.out.print(i + ", ");
        }

        //Ejercicio 7: NO SE HACE

        //Ejercicio 8: NO SE HACE

        //Ejercicio 9

        int[] array7 = {8,7,5,4,9,2,1,3,6,0};
        int aux;

        Arrays.sort(array7);

        for (int i=0;i<array7.length-1;i++){
            for (int j=0;j<array7.length-i-1;j++){
                if (array7[j+1] < array7[j]){
                    aux = array7[j+1];
                    array7[j+1] = array7[j];
                    array7[j] = aux;
                }
            }
        }

        for (int i : array7) {
            System.out.print(i + ", ");
        }

        //Ejercicio 10

        int[] array8 = {8,7,5,4,9,2,1,3,6,0};
        int menor;
        int posicion;
        int tmp;

        for (int i=0;i<array8.length-1;i++){
            menor = array8[i];
            posicion = i;
            for (int j=i+1;j<array8.length;j++){
                if (array8[j] < menor){
                    menor = array8[j];
                    posicion = j;
                }
            }
            if (posicion != i){
                tmp = array8[i];
                array8[i] = array8[posicion];
                array8[posicion] = tmp;
            }
        }

        for (int i : array8) {
            System.out.print(i + ", ");
        }

        //Ejercicio 11

        int[] array9 = {8,7,5,4,9,2,1,3,6,0};
        int j;

        System.out.print("Array: ");
        for (int k : array9) {
            System.out.print(k + ", ");
        }

        for (int i=1;i<array9.length;i++){
            aux = array9[i];
            j = i-1;
            while ((j>=0) && (aux<array9[j])){
                array9[j+1] = array9[j];
                j--;
            }
            array9[j+1] = aux;
        }

        System.out.println("\t");
        System.out.print("Array ordenado: ");
        for (int k : array9) {
            System.out.print(k + ", ");
        }

        //Ejercicio 12

        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.print("Array original: ");
        printArray(arr);

        mergeSort(arr);

        System.out.println("\t");
        System.out.print("Array ordenado: ");
        printArray(arr);

        //Ejercicio 13

        int[] array11 = {8,7,5,4,9,2,1,3,6,0};
        int salto,i;
        boolean cambios;

        System.out.print("Array: ");
        for (i=0;i<array11.length;i++){
            System.out.print(array11[i] + ", ");
        }

        for (salto = array11.length/2;salto!=0;salto/=2){
            cambios = true;
            while (cambios){
                cambios = false;
                for (i=salto;i<array11.length;i++){
                    if (array11[i-salto] > array11[i]){
                        aux = array11[i];
                        array11[i] = array11[i-salto];
                        array11[i-salto] = aux;
                        cambios = true;
                    }
                }
            }
        }

        System.out.println("\t");
        System.out.print("Array ordenado: ");
        for (i=0;i<array11.length;i++){
            System.out.print(array11[i] + ", ");
        }

        //Ejercicio 14

        int[] array12 = new int[20];

        for (i=0;i<20;i++){
            System.out.print((i+1) + "° número: ");
            array12[i] = input.nextInt();
        }

        System.out.println("\n¿cómo desea ordenar el arreglo? (ascendente/descendente)");
        String eleccion = input.nextLine();
        if ((!eleccion.equals("a")) && (!eleccion.equals("d"))){
            while ((!eleccion.equals("a")) && (!eleccion.equals("d"))){
                System.out.println("Ingrese a por ascendente o d por descendente:");
                eleccion = input.nextLine();
            }
        }

        System.out.println("Método a utilizar: ");
        System.out.println("1. Inserción");
        System.out.println("2. Burbuja");
        System.out.println("3. Selección");
        int metodo = input.nextInt();
        if ((metodo != 1) && (metodo != 2) && (metodo != 3)){
            while ((metodo != 1) && (metodo != 2) && (metodo != 3)){
                System.out.println("Ingrese una opción válida");
                System.out.println("1. Inserción");
                System.out.println("2. Burbuja");
                System.out.println("3. Selección");
                metodo = input.nextInt();
            }
        }

        if (eleccion.equals("a")){
            System.out.println("Arreglo ordenado de forma ASCENDENTE utilizando el método " + metodo);

        }else {
            System.out.println("Arreglo ordenado de forma DESCENDENTE utilizando el método " + metodo);

        }
        if (metodo == 1){
            insercion(array12,eleccion);
        } else if (metodo == 2) {
            burbuja(array12,eleccion);
        }else {
            seleccion(array12,eleccion);
        }

        input.close();
    }

    //Métodos merge, mergesort, print array del ej: 12
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //Métodos ejercicio 14

    //Metodo por inserción
    public static void insercion(int[] array, String ele){
        int j;
        int aux;

        System.out.println("Arreglo desordenado: ");
        for (int k : array) {
            System.out.print(k + ", ");
        }

        if (ele.equals("a")){
            for (int i=1;i<array.length;i++){
                aux = array[i];
                j = i-1;
                while ((j>=0) && (aux<array[j])){
                    array[j+1] = array[j];
                    j--;
                }
                array[j+1] = aux;
            }
        }else{

            int n = array.length;

            for (int i = 1; i < n; i++) {
                int valorActual = array[i];
                j = i - 1;

                while (j >= 0 && array[j] < valorActual) {
                    array[j + 1] = array[j]; // Desplaza los elementos hacia la derecha
                    j--;
                }

                array[j + 1] = valorActual; // Inserta el valor en su posición correcta
            }
        }

        System.out.println("\t");
        System.out.println("Array ordenado: ");
        for (int k : array) {
            System.out.print(k + ", ");
        }
    }

    //Método burbuja

    public static void burbuja(int[] array, String ele){
        int aux;

        System.out.println("Arreglo desordenado: ");
        for (int i : array) {
            System.out.print(i + ", ");
        }

        if (ele.equals("a")){
            Arrays.sort(array);

            for (int i=0;i<array.length-1;i++){
                for (int j=0;j<array.length-i-1;j++){
                    if (array[j+1] < array[j]){
                        aux = array[j+1];
                        array[j+1] = array[j];
                        array[j] = aux;
                    }
                }
            }
        }else{
            int n = array.length;
            boolean intercambio;

            do {
                intercambio = false;
                for (int i = 0; i < n - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        // Intercambia arr[i] y arr[i+1]
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        intercambio = true;
                    }
                }
            } while (intercambio);
        }

        System.out.println("\t");
        System.out.println("Arreglo ordenado: ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    //Método por selección

    public static void seleccion(int[] array, String ele){
        int menor;
        int posicion;
        int tmp;

        System.out.println("Arreglo desordenado");
        for (int i : array) {
            System.out.print(i + ", ");
        }

        if (ele.equals("a")){
            for (int i=0;i<array.length-1;i++){
                menor = array[i];
                posicion = i;
                for (int j=i+1;j<array.length;j++){
                    if (array[j] < menor){
                        menor = array[j];
                        posicion = j;
                    }
                }
                if (posicion != i){
                    tmp = array[i];
                    array[i] = array[posicion];
                    array[posicion] = tmp;
                }
            }
        }else{

            int n = array.length;

            for (int i = 0; i < n - 1; i++) {
                int maxIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (array[j] > array[maxIndex]) {
                        maxIndex = j;
                    }
                }

                // Intercambia arr[i] y arr[maxIndex]
                int temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }



        System.out.println("\t");
        System.out.println("Arreglo ordenado");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
