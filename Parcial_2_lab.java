import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//PARCIAL 2 LABORATORIO

//Casos de prueba

//NO MUTANTE:
// "ATCGAT",
// "GGAATT",
// "CCCGCG",
// "ATCGAT",
// "GGAATT",
// "CCCGCG"

//MUTANTE HORIZONTAL:
// "aaaagg",
// "gtcgat",
// "gttgca",
// "gtgtgt",
// "acgtac",
// "cggggg"

//MUTANTE VERTICAL:
// "acgtct",
// "actggg",
// "agtcgg",
// "atgcag",
// "gcatgg",
// "aggttc"

//MUTANTE DIAGONAL
// "agtgcc",
// "acagtt",
// "gagaca",
// "acacgt",
// "gtcacg",
// "acacct"

//MUTANTE COMBINADO
// "ATGCGA",
// "CAGTGC",
// "TTATGT",
// "AGAAGG",
// "CCCCTA",
// "TCACTG"

public class Parcial_2_lab {
    public static void main(String[] args) {
        int humanCounter = 1;

        System.out.println("\n-------------------------------------------------------DETECCIÓN DE MUTANTES-------------------------------------------------------\n\n");
        System.out.println("Buen día Magneto, mediante este programa usted podrá detectar si un humano es mutante o no mediante su ADN");
        System.out.println("Usted deberá ingresar las 6 secuencias de 6 bases nitrogenadas del ADN del humano en cuestión, representadas por las letras A, T, C, G");
        System.out.println("Se detectará gen mutante si hay más de una secuencia de cuatro bases iguales de forma horizontal, vertical o diagonal.\n");

        //Ciclo para repetir el programa las veces requeridas
        while(true) {
            //Matriz a rellenar con las secuencias, las cuales serán 6 y estarán determinadas por el contador
            List<String> dnaList = new ArrayList<>();
            int counter = 1;

            Scanner scanner = new Scanner(System.in);

            //Ciclo para rellenar 6 secuencias
            while (true) {
                System.out.println("\n" + humanCounter + "° Humano\n");

                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n" + counter + "° Secuencia\n");

                //Función para rellenar cada secuencia
                String dnaSequence = stringFilling(counter, scanner);

                //Función para validar que sean 6 caracteres
                String dnaLong = stringLong(dnaSequence);

                //Función para validar que sean caracteres válidos
                String dnaChars = stringChars(dnaLong);

                //Ciclo para determinar que la secuencia rellenada sea válida
                while (dnaLong.equals(" ") || dnaChars.equals(" ")) {
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n\tErrores detectados.");
                    System.out.println("\tRecuerde Magneto que la longitud de cada secuencia debe ser de 6 caracteres y los caracteres válidos son A, C, G, T");
                    System.out.println("\tVuelva a rellenar la " + counter + "° secuencia: \n");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");

                    dnaSequence = stringFilling(counter, scanner);
                    dnaLong = stringLong(dnaSequence);
                    dnaChars = stringChars(dnaLong);
                }

                //Agregar la secuencia a la lista para formar la matriz
                dnaList.add(dnaSequence);

                //Condición para rellenar solamente 6 secuencias
                if (dnaList.size() == 6) {
                    System.out.println("\n" + counter + "° Secuencia de ADN rellenada correctamente");
                    break;
                }

                counter++;
            }

            //Muestra de la matriz
            System.out.println("\n------------------Matriz de secuencia de ADN------------------\n");
            for (String row : dnaList) {
                for (char element : row.toCharArray()) {
                    System.out.print("\t" + element);
                }
                System.out.println();
            }
            System.out.println("\n--------------------------------------------------------------");

            //Funcion is_Mutant(dna) para determinar si el humano tiene ADN mutante o no
            boolean mutation = isMutant(dnaList);

            //Mensaje a mostrar de acuerdo a los resultados obtenidos
            if (mutation) {
                System.out.println("\n\tResultado: positivo. Este humano presenta ADN mutante\n");
            } else {
                System.out.println("\n\tResultado: negativo. Este humano no presenta ADN mutante\n");
            }

            //Condición de repetición
            System.out.println("\n\tSr. Magneto ¿Desea comprobar el ADN de otro humano?");
            String answer = (scanner.nextLine()).toLowerCase();
            if ((!answer.equals("si")) && (!answer.equals("no"))){
                while ((!answer.equals("si")) && (!answer.equals("no"))){
                    System.out.println("\n\tPor favor responda si o no");
                    answer = (scanner.nextLine()).toLowerCase();
                }
            }

            if (answer.equals("si")){
                humanCounter++;
                continue;
            }else {
                break;
            }
        }

        System.out.println("\n--------------------------------------------------------------");
        System.out.println("\nPrograma finalizado. Suerte con su búsqueda");
        System.out.println("\n--------------------------------------------------------------\n\n");
    }

    //Función para rellenar los strings con la secuencia de ADN
    public static String stringFilling(int counter, Scanner scanner) {
        System.out.println("Ingrese la " + counter + "° secuencia:");
        return (scanner.nextLine()).toUpperCase();
    }

    //Función para validar la longitud de cada string (6 caracteres)
    public static String stringLong(String sequence) {
        if (sequence.length() == 6) {
            return sequence;
        } else {
            return " ";
        }
    }

    //Función para validar los caracteres de cada string (A,T,G,C)
    public static String stringChars(String sequence) {
        for (char c : sequence.toCharArray()) {
            if (c != 'A' && c != 'C' && c != 'G' && c != 'T') {
                return " ";
            }
        }
        return sequence;
    }

    //Función para determinar la mutación de ADN
    public static boolean isMutant(List<String> dna) {
        //Contador de secuencias. Si hay 2 o más, la función retornará TRUE dando por encontrado el gen mutante
        int sequenceCounter = 0;

        // Caso HORIZONTAL
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                String subsequence = dna.get(i).substring(j, j + 4);
                if (subsequence.equals("AAAA") || subsequence.equals("TTTT") || subsequence.equals("CCCC") || subsequence.equals("GGGG")) {
                    sequenceCounter++;
                }
            }
        }

        // Caso VERTICAL
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (dna.get(0 + i).charAt(j) == dna.get(1 + i).charAt(j) && dna.get(2 + i).charAt(j) == dna.get(3 + i).charAt(j)) {
                    sequenceCounter++;
                }
            }
        }

        // Caso DIAGONAL
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Diagonales DESCENDENTES
                if (dna.get(0 + i).charAt(0 + j) == dna.get(1 + i).charAt(1 + j) &&
                        dna.get(2 + i).charAt(2 + j) == dna.get(3 + i).charAt(3 + j)) {
                    sequenceCounter++;
                }
                // Diagonales ASCENDENTES
                else if (dna.get(5 - i).charAt(0 + j) == dna.get(4 - i).charAt(1 + j) &&
                        dna.get(3 - i).charAt(2 + j) == dna.get(2 - i).charAt(3 + j)) {
                    sequenceCounter++;
                }
            }
        }

        return sequenceCounter >= 2;
    }
}
