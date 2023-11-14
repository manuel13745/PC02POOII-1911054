import java.util.Arrays;
import java.util.List;

public class Pregunta1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(3, 8, 12, 5, 6, 17, 20, 22, 30, 15);

        System.out.println("Numeros pares en la lista:");
        numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .forEach(System.out::println);
    }
}
