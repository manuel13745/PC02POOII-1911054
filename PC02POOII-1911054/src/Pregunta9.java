import java.util.Arrays;

public class Pregunta9 {
    public static void main(String[] args) {
        String[] palabras = {"Así", "se", "hace", "profe"};

        System.out.println("Arreglo de cadenas: " + Arrays.toString(palabras));
        System.out.println("Total de palabras: " + contarPalabras(palabras));
    }

    private static long contarPalabras(String[] palabras) {
        return Arrays.stream(palabras).count();
    }
}
