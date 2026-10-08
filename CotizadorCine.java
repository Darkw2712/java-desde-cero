public class CotizadorCine {
    public static void main(String[] args) {
        int edad = 22;
        int tipoSala = 3;
        // 1: standard, 2: 3D, 3: IMAX
        boolean esEstudiante = true;

        int precioBase = switch (tipoSala) {
            case 1 -> 8;
            case 2 -> 12;
            case 3 -> 15;
            default -> 0;
        };
        //Vaqlidar si se ingresa un valor diferente a 1,2 o 3 para el tipo de sala, en caso de ser así se imprime un mensaje y se termina la ejecución del programa
        if (precioBase == 0) {
            System.out.println("Tipo de sala inválido. Ingresar un valor entre 1 y 3");
            return;
        }
        double descuento = 0;
       //Porcentaje de descuento sobre el precio base
       if (edad<12 || edad >=65){
        descuento = 0.5; //50% de descuento;
       }else if (esEstudiante) {
        descuento = 0.2; //20% de descuento
       }else{
        descuento = 0; //Sin descuento
       }

       //Nombre de la sala según el tipo de sala
        String nombreSala = switch(tipoSala) {
            case 1 -> "Standard";
            case 2 -> "3D";
            case 3 -> "IMAX";
            default -> "Desconocido";
};

       System.out.println("--- TICKET DE CINE ---");
       System.out.println("Tipo de sala: " + nombreSala);
       System.out.println("Precio base: $" + precioBase);
       System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
       double precioFinal = precioBase * (1 - descuento);
       System.out.println("Precio final a pagar: $" + precioFinal);
    }
}