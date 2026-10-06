
public class CalculadoraDescuento {
    public static void main(String[] args) {
        // 1. Declaración de variables de entrada
        double montoCompra = 150.0;
        boolean esMiembro = true;

        // 2. Variable para almacenar el porcentaje de descuento
        double porcentajeDescuento = 0.0;

        // 3. Evaluación de condiciones
        if (esMiembro && montoCompra >= 100.0) {
            porcentajeDescuento = 0.20; // 20% de descuento
        } else if (esMiembro && montoCompra < 100.0) {
            porcentajeDescuento = 0.10; // 10% de descuento
        } else if (!esMiembro && montoCompra >= 100.0) {
            porcentajeDescuento = 0.05; // 5% de descuento
        } else {
            porcentajeDescuento = 0.0;  // Sin descuento (0%)
        }

        // 4. Cálculos dinámicos
        double montoDescuento = montoCompra * porcentajeDescuento;
        double montoFinal = montoCompra - montoDescuento;

        // 5. Impresión de resultados
        System.out.println("Monto inicial de la compra: $" + montoCompra);
        System.out.println("Descuento aplicado: " + (int)(porcentajeDescuento * 100) + "%");
        System.out.println("Monto final a pagar: $" + montoFinal);
    }
}