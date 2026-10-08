public class Controldias {
    public static void main(String[] args){
        int diasemana = 3;

        switch (diasemana) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día inválido. Ingresar uno entre 1 y 7");
        }

    }
    
}
