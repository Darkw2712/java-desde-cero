public class SimuladorAhorroDoWhile {
    public static void main(String[] args) {
        double metaAhorro = 500.0;
        double saldoActual = 0.0;
        double depositoSemanal = 10.0;
        int semana = 0;

        System.out.println("--- SIMULADOR DE AHORRO (DO-WHILE) ---");
        System.out.println("Meta de ahorro: $" + metaAhorro);

        // La ejecución entra directamente sin evaluar la condición primero
        do {
            saldoActual += depositoSemanal;
            semana++;
            System.out.println("Semana " + semana + ": Depositaste $" + depositoSemanal + " | Saldo actual: $" + saldoActual);
        } while (saldoActual < metaAhorro); // La condición se evalúa al final del ciclo

        System.out.println("¡Felicidades! Alcanzaste tu meta en " + semana + " semanas.");
        System.out.println("Saldo final ahorrado: $" + saldoActual);
    }
}