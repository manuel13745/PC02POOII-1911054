import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Pregunta1 {
    public static void main(String[] args) {
        List<Integer> numeros = new Random().ints(10, 1, 101)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Lista de números aleatorios:");
        System.out.println(numeros);

        System.out.println("\nNúmeros pares en la lista:");

        numeros.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}
