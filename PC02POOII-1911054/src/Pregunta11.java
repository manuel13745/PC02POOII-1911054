import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Pregunta11 {

    public static void main(String[] args) {

        List<String> users = Arrays.asList("Amalia", "Jose",
                "Teresa", "Ana", "Daniel", "Alberto", "María");
        Optional<String> findFirst =
                users.parallelStream().filter(s ->
                        s.startsWith("A")).findFirst();
        Optional<String> findAny =
                users.parallelStream().filter(s ->
                        s.startsWith("A")).findAny();
    }
}
