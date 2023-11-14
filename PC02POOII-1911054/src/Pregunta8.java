import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.Map;

public class Pregunta8 {
    public static void main(String[] args) {
        List<Integer> numeros = generarNumerosAleatoriosList(10);

        System.out.println("Numeros generados aleatoriamente: " + numeros);
        System.out.println("Cubo de los numeros mayores a 50:");

        numeros.stream()
                .map(numero -> new AbstractMap.SimpleEntry<>(numero, numero * numero * numero))
                .filter(entry -> entry.getValue() > 50)
                .forEach(entry -> System.out.println("Cubo: " + entry.getValue() + " de: " + entry.getKey()));
    }

    private static List<Integer> generarNumerosAleatoriosList(int n) {
        return new Random().ints(n, 1, 100).boxed().collect(Collectors.toList());
    }
}
