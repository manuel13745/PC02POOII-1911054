import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Random;

public class Pregunta3 {
    public static void main(String[] args) {
        List<Integer> numeros = generarNumerosAleatorios(10);

        System.out.println("Numeros generados aleatoriamente: " + numeros);
        System.out.println("Numeros duplicados:");
        numeros.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

    private static List<Integer> generarNumerosAleatorios(int n) {
        return new Random().ints(n, 1, 100).boxed().collect(Collectors.toList());
    }
}
