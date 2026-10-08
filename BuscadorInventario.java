import java.util.Arrays;
public class BuscadorInventario {
    public static void main(String[] args){
        String[] productos = {"Teclado", "Mouse", "Monitor", "Audífonos", "Cámara", "Micrófono"};
        String productoBuscado = "Monitor"; // Producto que se desea buscar
        System.out.println("--- BUSCADOR DE INVENTARIO ---");
        System.out.println("Arreglo original de productos: "+Arrays.toString(productos));
        Arrays.sort(productos); // Ordena el arreglo de productos alfabéticamente
        System.out.println("Arreglo ordenado de productos: "+Arrays.toString(productos));
        int indiceEncontrado = Arrays.binarySearch(productos, productoBuscado);
        System.out.println("El producto " + productoBuscado + " está en el índice: " + indiceEncontrado);
        if(indiceEncontrado >= 0){
            System.out.println("Producto encontrado: " + productos[indiceEncontrado] + " en el índice " + indiceEncontrado);
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }   
}
