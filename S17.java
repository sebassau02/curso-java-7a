import java.util.Scanner;

public class SumaParesIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los números pares hasta " + numero + " es: " + suma);
    }
}
