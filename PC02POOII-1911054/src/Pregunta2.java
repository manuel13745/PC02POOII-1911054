import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;

public class Pregunta2 {
    public static void main(String[] args) {
        List<Integer> numeros = generarNumerosAleatorios(10);

        System.out.println("Numeros generados aleatoriamente: " + numeros);
        System.out.println("Numeros que comienzan con 5:");
        numeros.stream()
                .filter(numero -> numero.toString().startsWith("5"))
                .forEach(System.out::println);
    }

    private static List<Integer> generarNumerosAleatorios(int n) {
        return new Random().ints(n, 1, 100).boxed().collect(Collectors.toList());
    }
}
