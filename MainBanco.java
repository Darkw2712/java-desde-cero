public class MainBanco {
    public static void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria("Carlos Gómez", "CUENTA-001", 500.0);

        System.out.println("--- ESTADO INICIAL DE LA CUENTA ---");
        cuenta.mostrarEstado();

        System.out.println("\n--- REALIZANDO DEPÓSITOS ---");
        cuenta.depositar(200.0);
        cuenta.retirar(150.0);
        cuenta.retirar(700.0);
        
        System.out.println("\n--- ESTADO FINAL DE LA CUENTA ---");
        cuenta.mostrarEstado();
    }

    
}
