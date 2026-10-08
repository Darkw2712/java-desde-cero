public class EstadoPedido {
    public static void main(String[] args){
        String nombreCliente = "Carlos";
        int codigoEstado = 5;
        String mensajeEstado = "";

        switch (codigoEstado) {
            case 1 -> mensajeEstado = "Su pedido ha sido recibido y está pendiente de procesamiento";
            case 2 -> mensajeEstado = "Su pedido está en preparación en nuestro almacén";
            case 3 -> mensajeEstado = "Su pedido está en camino con el repartidor";
            case 4 -> mensajeEstado = "Su pedido ha sido entregado con éxito";
            case 5 -> mensajeEstado = "Su pedido ha sido cancelado";
            default -> mensajeEstado = "Código de estado inválido, por favor contactar a soporte";
        }
        System.out.println("Hola " + nombreCliente + ", el estado de tu pedido " + " # " + (codigoEstado) + " es: " + mensajeEstado);
    }
    
}
