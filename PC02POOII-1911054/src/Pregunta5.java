import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Random;

public class Pregunta5 {
    public static void main(String[] args) {
        List<Integer> numeros = generarNumerosAleatorios(10);

        System.out.println("Numeros generados aleatoriamente: " + numeros);
        System.out.println("Valores en orden descendente:");
        numeros.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static List<Integer> generarNumerosAleatorios(int n) {
        return new Random().ints(n, 1, 100).boxed().collect(Collectors.toList());
    }
}
