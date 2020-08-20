
//@author scarfinson
import java.util.InputMismatchException;
import java.util.Scanner;

public class CollatzConjecture {

    public static void main(String[] args) {
        CollatzConjecture metodo = new CollatzConjecture();
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Entrada: ");
            String x = metodo.obtenerResultado(entrada.nextInt());
            System.out.println("Salida: " + x);
        } catch (InputMismatchException e) {
            System.err.println("Ha ingresado datos no válidos. Revise de nuevo.");
        }

    }

    public String obtenerResultado(long x) {
        String secuencia = new String();
        if (x == 1) {
            return secuencia;
        } else if (x % 2 == 0) {
            x = x / 2;
            return secuencia += x + " " + obtenerResultado(x);
        } else {
            x = 3 * x + 1;
            return secuencia += x + " " + obtenerResultado(x);
        }
    }
}
