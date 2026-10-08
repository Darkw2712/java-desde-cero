public class InversionCrecimiento {
    public static void main(String[] args){
        double capitalInicial = 1000.0;
        double tasaInteres = 0.08;
        int anios = 5;
        double saldoActual = capitalInicial;
        System.out.println("--- SIMULADOR DE INVERSION ---");
        System.out.println("Capital Ininicial: $" + capitalInicial);
        System.out.println("Tasa de interés: " + tasaInteres * 100 + "%");
        System.out.println("Plazo: " + anios + " años");

        for (int i =1; i<anios;i++){
            double interesAnio = saldoActual * tasaInteres;
            saldoActual += interesAnio;

            // %.2f da formato a 2 decimales para montos de dinero
            System.out.printf("Año %d: Interés ganado: $%.2f | Saldo acumulado: $%.2f%n", 
                              i, interesAnio, saldoActual);
        }

        System.out.println("--------------------------------");
        double gananciaNeta = saldoActual - capitalInicial;
        System.out.printf("Ganancia neta total: $%.2f%n ", gananciaNeta);
        System.out.printf("Monto final acumulado: $%.2f%n", saldoActual);
    }
}
