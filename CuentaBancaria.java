public class CuentaBancaria {
String titular;
String numeroCuenta;
double saldo;

//Consutructor
public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
    this.titular = titular;
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
}

//Métodos
public void depositar(double monto){
    if (monto>0){
        saldo +=monto;
        System.out.println("El depósito de $" + monto + " se realizó correctamente. El nuevo saldo es $" + saldo);
    }else{
        System.out.println("ERROR. El monto a depositar debe ser mayor a cero.");
    }

}

public void retirar(double monto){
    if (monto > 0 && monto <= saldo){
        saldo -= monto;
        System.out.println("El retiro de $" + monto + " se realizó correctamente. El nuevo saldo es $" + saldo);
    }else if (monto > saldo){
        System.out.println("ERROR. No hay suficiente saldo para realizar el retiro.");}
}

public void mostrarEstado(){
    System.out.println("Titular: " + titular + " | Número de cuenta: " + numeroCuenta + " | Saldo: $" + saldo);
}


}


