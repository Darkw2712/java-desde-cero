public class EstadoPedido {
    public static void main(String[] args){
        String nombreCliente = "Carlos";
        int codigoEstado = 5;
     

        String mensajeEstado = switch (codigoEstado) {
            case 1 -> "Su pedido ha sido recibido y está pendiente de procesamiento";
            case 2 -> "Su pedido está en preparación en nuestro almacén";
            case 3 -> "Su pedido está en camino con el repartidor";
            case 4 -> "Su pedido ha sido entregado con éxito";
            case 5 -> "Su pedido ha sido cancelado";
            default -> "Código de estado inválido, por favor contactar a soporte";
        };
        System.out.println("Hola " + nombreCliente + ", el estado de tu pedido " + " # " + codigoEstado + " es: " + mensajeEstado);
    }
    
}
