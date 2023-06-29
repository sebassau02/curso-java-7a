public class Docena {
    public static void main(String[] args) {
        int numero = 19;

        if (numero >= 1 && numero <= 12) {
            System.out.println("El número pertenece a la primera docena");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número pertenece a la segunda docena");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("El número pertenece a la tercera docena");
        } else {
            System.out.println("El número está fuera de rango");
        }
    }
}
