public class Categoria {
    public static void main(String[] args) {
        char categoria = 'b';

        switch (categoria) {
            case 'a':
                System.out.println("Hijo");
                break;
            case 'b':
                System.out.println("Padres");
                break;
            case 'c':
                System.out.println("Abuelos");
                break;
            default:
                System.out.println("Categoría inválida");
                break;
        }
    }
}
