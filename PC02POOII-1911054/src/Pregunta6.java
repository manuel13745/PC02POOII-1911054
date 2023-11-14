import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Pregunta6 {
    public static void main(String[] args) {
        int[] array = generarNumerosAleatoriosArray(10);

        System.out.println("Array generado aleatoriamente: " + Arrays.toString(array));
        System.out.println("¿Algun valor aparece al menos tres veces? " + contieneRepetidos(array, 3));
    }

    private static int[] generarNumerosAleatoriosArray(int n) {
        return new Random().ints(n, 1, 10).toArray();
    }

    private static boolean contieneRepetidos(int[] array, int repetirVeces) {
        Map<Integer, Integer> contador = new HashMap<>();

        for (int numero : array) {
            contador.put(numero, contador.getOrDefault(numero, 0) + 1);
            if (contador.get(numero) >= repetirVeces) {
                return true;
            }
        }

        return false;
    }
}
