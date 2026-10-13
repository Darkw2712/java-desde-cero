public class MainPOO {
    public static void main(String[] args) {
        // 1. Creación de objetos usando el operador 'new' y el constructor
        Producto laptop = new Producto("Laptop Dell", 1200.0, 5);
        Producto telefono = new Producto("Smartphone Samsung", 800.0, 10);

        System.out.println("--- DETALLES INICIALES ---");
        // 2. Invocación de métodos sobre cada objeto
        laptop.mostrarDetalles();
        telefono.mostrarDetalles();

        System.out.println("\n--- APLICANDO DESCUENTOS ---");
        laptop.aplicarDescuento(10.0); // 10% de descuento
        telefono.aplicarDescuento(15.0); // 15% de descuento

        System.out.println("\n--- ESTADO FINAL DE LOS OBJETOS ---");
        laptop.mostrarDetalles();
        telefono.mostrarDetalles();
    }
}