public class MainBanco {
    public static void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria("Carlos Gómez", "CUENTA-001", 500.0);

        System.out.println("--- ESTADO INICIAL DE LA CUENTA ---");
        cuenta.mostrarEstado();

        // Forma correcta de leer atributos: usando getters
        System.out.println("Consultando titular con getter: " + cuenta.getTitular());
        System.out.println("Consultando saldo con getter: $" + cuenta.getSaldo());

        // Modificando titular de forma segura con setter
        cuenta.setTitular("Carlos Gómez Pérez");

        System.out.println("\n--- REALIZANDO DEPÓSITOS ---");
        cuenta.depositar(200.0);
        cuenta.retirar(150.0);
        cuenta.retirar(700.0);
          
        System.out.println("\n--- ESTADO FINAL DE LA CUENTA ---");
        cuenta.mostrarEstado();
    }

    
}
