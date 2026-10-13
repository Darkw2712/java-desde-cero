public class Producto {
    // 1. Atributos (Estado del objeto)
    String nombre;
    double precio;
    int stock;

    // 2. Constructor (Método especial para inicializar el objeto al crearlo)
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre; // 'this.nombre' se refiere al atributo de la clase
        this.precio = precio;
        this.stock = stock;
    }

    // 3. Métodos (Comportamientos del objeto)
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock + " unidades");
    }

    public void aplicarDescuento(double porcentaje) {
        double descuento = precio * (porcentaje / 100);
        precio -= descuento;
        System.out.println("Se aplicó un " + porcentaje + "% de descuento a '" + nombre + "'. Nuevo precio: $" + precio);
    }
}