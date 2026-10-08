public class AnalizadorTemperaturas {
    public static void main(String[] args){
        double[] temperaturas = {22.5, 28.0, 19.5, 31.2, 25.0, 18.0, 29.4}; // Array de temperaturas registradas durante la semana
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"}; // Array de días de la semana
        double sumaTemp = 0;
        int tempMayor25 = 0; // Contador de días con temperatura mayor a 25 grados
        double tempMax = temperaturas[0]; // Inicialización de la temperatura máxima con el primer valor del array
        String diaMax = dias[0]; // Inicialización del día con la temperatura máxima
        double tempMin = temperaturas[0]; // Inicialización de la temperatura mínima con el primer valor del array
        String diaMin = dias[0]; // Inicialización del día con la temperatura mínima

        //System.out.println("Día más caluroso de la semana: " +" Juebes con " + temperaturas[3] +" grados.");
        //System.out.println("Día más frío de la semana: " + " sábado con " + temperaturas[5] + " grados.");
        for(int i=0; i<temperaturas.length; i++){
            sumaTemp += temperaturas[i]; // Suma de todas las temperaturas
            if(temperaturas[i]>25.0){
                tempMayor25++; // Incremento del contador si la temperatura es mayor a 25 grados
            }
            if(temperaturas[i] > tempMax){
                tempMax = temperaturas[i];
                diaMax = dias[i];
            }
            if(temperaturas[i] < tempMin){
                tempMin = temperaturas[i];
                diaMin = dias[i];
            }
        }
        double promedioTemp = sumaTemp/temperaturas.length; // Cálculo del promedio de temperaturas
        System.out.println("Días con temperatura superior a 25 grados: " + tempMayor25 + " días.");
        System.out.printf("Promedio de temperaturas de la semana: %.2f °C%n", promedioTemp);
        System.out.println("Día más caluroso de la semana: " + diaMax + " con " + tempMax + " °C.");
        System.out.println("Día más frío de la semana: " + diaMin + " con " + tempMin + " °C.");
    }
}
