import java.util.ArrayList;

public class TP9 {

    public static void main(String[] args) {

        // 1. Crea un ArrayList de números enteros y agrega 5 números a la lista.
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // 2. Crea un ArrayList de cadenas y agrega 3 nombres a la lista.
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        // 3. Imprime todos los elementos de un ArrayList de enteros.
        System.out.println("Los números son: " + numeros);

        // 4. Encuentra la longitud (número de elementos) de un ArrayList de caracteres.
        System.out.println("La longitud de caracteres es: " + nombres.size());

        // 5. Elimina un elemento específico de un ArrayList de cadenas.
        nombres.remove("Pedro");
        System.out.println("Los nombres son: " + nombres);

        // 6. Comprueba si un ArrayList de números enteros está vacío.
        boolean estaVacio = numeros.isEmpty();
        System.out.println("El ArrayList de números está vacío: " + estaVacio);

        // 7. Encuentra el elemento más grande en un ArrayList de números.
        int elementoMasGrande = numeros.stream().max(Integer::compareTo).get();
        System.out.println("El elemento más grande es: " + elementoMasGrande);

        // 8. Copia todos los elementos de un ArrayList en otro ArrayList nuevo.
        ArrayList<Integer> copiaNumeros = new ArrayList<>();
        copiaNumeros.addAll(numeros);
        System.out.println("La copia de los números es: " + copiaNumeros);

        // 9. Invierte un ArrayList de enteros (el primer elemento se convierte en el último y viceversa).
        for (int i = 0; i < numeros.size() / 2; i++) {
            int aux = numeros.get(i);
            numeros.set(i, numeros.get(numeros.size() - i - 1));
            numeros.set(numeros.size() - i - 1, aux);
        }
        System.out.println("Los números invertidos son: " + numeros);

        // 10. Combina dos ArrayLists de enteros en uno solo.
        ArrayList<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);

        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(4);
        numeros2.add(5);
        numeros2.add(6);

        ArrayList<Integer> numerosCombinados = new ArrayList<>();
        numerosCombinados.addAll(numeros1);
        numerosCombinados.addAll(numeros2);
        System.out.println("Los números combinados son: " + numerosCombinados);
    }
}
