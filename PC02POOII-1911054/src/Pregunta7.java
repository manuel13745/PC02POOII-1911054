import java.util.Arrays;

public class Pregunta7 {
    public static void main(String[] args) {
        String[] A = {"1", "2", "3", "4", "5", "8", "23"};
        String[] B = {"4", "6", "8", "0", "2"};

        System.out.println("Array A: " + Arrays.toString(A));
        System.out.println("Array B: " + Arrays.toString(B));

        String[] AB = concatenarArrays(A, B);
        System.out.println("Array concatenado AB: " + Arrays.toString(AB));
    }

    private static String[] concatenarArrays(String[] A, String[] B) {
        String[] AB = new String[A.length + B.length];
        System.arraycopy(A, 0, AB, 0, A.length);
        System.arraycopy(B, 0, AB, A.length, B.length);
        return AB;
    }
}
