

public class CalculadoraDescuento {
    public static void main(String[] args){
        double montocompra = 150;
        boolean esmiembro = true;
        if (esmiembro && montocompra >= 100) {
            System.out.println("Obtiene un 20% de descuento");
        } else if (esmiembro && montocompra < 100) {
            System.out.println("Obtiene un 10% de descuento");
        } else if (!esmiembro && montocompra >= 100) {
            System.out.println("Obtiene un 5% de descuento");
        } else {
            System.out.println("No obtiene descuento");
        }
        System.out.println("Monto inicial de la compra: " + montocompra);
        System.out.println("Monto final de la compra: " + (montocompra - (montocompra * 0.20)));
    }
}
