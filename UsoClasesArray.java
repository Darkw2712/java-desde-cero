import java.util.Arrays; // Importación obligatoria para usar la clase Arrays

public class UsoClasesArray {
    public static void main(String[] args) {
        int[] numeros = {45, 12, 89, 3, 27, 64};

        // 1. Imprimir arreglo sin recurrir a un bucle manual
        System.out.println("Arreglo original: " + Arrays.toString(numeros));

        // 2. Ordenar el arreglo (Dual-Pivot Quicksort)
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        // 3. Búsqueda binaria
        int elementoBuscado = 27;
        int indiceEncontrado = Arrays.binarySearch(numeros, elementoBuscado);
        System.out.println("El número " + elementoBuscado + " está en el índice: " + indiceEncontrado);

        // 4. Copiar arreglo completo (con redimensión)
        int[] copiaMayor = Arrays.copyOf(numeros, 10); // Crea un arreglo de tamaño 10 rellenando con ceros
        System.out.println("Copia con tamaño 10: " + Arrays.toString(copiaMayor));

        // 5. Copiar un subrango (Rango: índice 1 a 4, el 4 no se incluye)
        int[] subArreglo = Arrays.copyOfRange(numeros, 1, 4);
        System.out.println("Subrango (índices 1 a 3): " + Arrays.toString(subArreglo));
    }
}