public class SimuladorAhorro {
    public static void main(String[] args){
        double metaAhorro = 500.0; // Meta de ahorro en dólares
        double saldoActual = 0.0; // Saldo actual en dólares
        double depositoSemanal = 10; // Depósito semanal en dólares
        int semana = 0; // Contador de semanas
        System.out.println("--- SIMULADOR DE AHORRO ---");
        System.out.println("Meta de ahorro: $" + metaAhorro);
        while (saldoActual < metaAhorro){
            saldoActual += depositoSemanal; // Se suma el depósito semanal al saldo actual
            semana++;
            System.out.println("Semana " + semana + ": Deposistaste " + depositoSemanal + " | Saldo actual: " + saldoActual);
        }
        System.out.println("Felicidades, alcanzaste tu meta de ahorro en: " + semana + " semanas.");
        System.out.println("Saldo final ahorrado: $" + saldoActual);
    }
}
