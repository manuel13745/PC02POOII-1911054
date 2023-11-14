import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Pregunta10 {
    public static void main(String[] args) {
        String[] cadenas = generarCadenasAleatorias(10);

        System.out.println("Arreglo de cadenas generado aleatoriamente: " + Arrays.toString(cadenas));
        System.out.println("Elementos duplicados y numero de veces:");

        encontrarDuplicados(cadenas).forEach((elemento, contador) ->
                System.out.println(elemento + " se repite " + contador + " veces."));
    }

    private static String[] generarCadenasAleatorias(int n) {
        Random random = new Random();
        return random.ints(n, 0, 10)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
    }

    private static Map<String, Long> encontrarDuplicados(String[] cadenas) {
        return Arrays.stream(cadenas)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
