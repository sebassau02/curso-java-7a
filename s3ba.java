public class DiasMes {
    public static void main(String[] args) {
        String mes = "febrero";
        int dias = 0;

        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            case "febrero":
                dias = 28;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            default:
                System.out.println("Mes inválido");
                break;
        }

        if (dias > 0) {
            System.out.println(mes + " tiene " + dias + " días");
        }
    }
}
