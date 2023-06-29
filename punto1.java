public class EvaluacionesAlumno {
    public static void main(String[] args) {
        // Definir las calificaciones
        int calificacion1 = 8;
        int calificacion2 = 6;
        int calificacion3 = 9;

        // Calcular el promedio
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;

        // Verificar si está aprobado o reprobado
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
