public class MayorVariable {
    public static void main(String[] args) {
        int variable1 = 10;
        int variable2 = 5;
        int variable3 = 8;

        int mayor = variable1;

        if (variable2 > mayor && variable2 > variable3) {
            mayor = variable2;
        }
        if (variable3 > mayor) {
            mayor = variable3;
        }

        System.out.println("El mayor valor es: " + mayor);
    }
}
