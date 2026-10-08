public class GestionNotasArray {
    public static void main(String[] args){
        double[] notas = {85.5, 90.0, 78.2, 92.4, 88.0}; // Array de 5 notas
        
        System.out.println("Primera nota: " + notas[0]); // Acceso a la primera nota
        System.out.println("Cantidad de notas: " + notas.length); // Tamaño del array

        // 3. Recorrido del arreglo con bucle FOR tradicional
        System.out.println("\n--- Recorrido con For Tradicional ---");
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota en posición [" + i + "]: " + notas[i]);
            suma += notas[i];
        }

        double promedio = suma / notas.length;
        System.out.printf("Promedio general: %.2f%n", promedio);

        // 4. Recorrido con bucle FOR-EACH (Sintaxis simplificada)
        System.out.println("\n--- Recorrido con Bucle For-Each ---");
        for (double nota : notas) { //por cada elemento nota de tipo double en el arreglo notas, ejecuta el bloque
            System.out.println("Nota: " + nota);
        } 
    }
}
