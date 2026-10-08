public class TablaMultiplicar {
    public static void main(String[] args){
        int numero = 7; //número base de la tabla
        int limite = 10; //hasta qué número se multiplicará
        int sumaTotal = 0; //variable para almacenar la suma de los resultados
        System.out.println("--- TABLA DE MULTIPLICAR DEL " + numero + " ---");
        for (int i = 1; i <= limite; i++){
            int resultado = numero * i;
            sumaTotal = sumaTotal + resultado;
            String paridad;
            if(resultado%2 == 0){
               paridad = ("Par");
            }else {
                paridad = ("Impar");
            }
            System.out.println(numero + " x " + i + " = " + resultado + " (" + paridad + ")");
        }
        System.out.println("La suma total es: " + sumaTotal);
        System.out.println("---------------------------------");
    }
}
