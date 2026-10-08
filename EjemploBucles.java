public class EjemploBucles {
    public static void main(String[] args){
        System.out.println("--- Bucle FOR ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
        }
        System.out.println("--- Bucle WHILE ---");
        int contador = 3;
        while(contador > 0) {
            System.out.println("Contador: " + contador);
            contador--;
        }
        System.out.println("--- Bucle DO WHILE ---");
        int numero = 10;
        do{
            System.out.println("Número: " + numero);
            numero++;
        }while (numero<5);
    }
}
