import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;

public class Pregunta4 {
    public static void main(String[] args) {
        List<Integer> numeros = generarNumerosAleatorios(10);

        System.out.println("Numeros generados aleatoriamente: " + numeros);
        System.out.println("Numero total de elementos: " + numeros.stream().count());
    }

    private static List<Integer> generarNumerosAleatorios(int n) {
        return new Random().ints(n, 1, 100).boxed().collect(Collectors.toList());
    }
}
