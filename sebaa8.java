public class JuegoPiedraPapelTijera {
    public static void main(String[] args) {
        int jugador1 = 0;  // Piedra
        int jugador2 = 2;  // Tijera

        if ((jugador1 == 0 && jugador2 == 2) || (jugador1 == 1 && jugador2 == 0) || (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("Jugador 1 es el ganador");
        } else if ((jugador2 == 0 && jugador1 == 2) || (jugador2 == 1 && jugador1 == 0) || (jugador2 == 2 && jugador1 == 1)) {
            System.out.println("Jugador 2 es el ganador");
        } else {
            System.out.println("Empate");
        }
    }
}
Puedes ejecutar cada programa por separado para obtener los resultados correspondientes a cada ejercicio.






