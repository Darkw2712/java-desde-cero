public class CuentaBancaria {
private String titular;
private String numeroCuenta;
private double saldo;

//Constructor
public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
    this.titular = titular;
    this.numeroCuenta = numeroCuenta;
    //Se usa setter para validar el saldo inicial
    if(saldoInicial >=0){
        this.saldo = saldoInicial;
    }else {
        this.saldo = 0;

    }
}

//Getters (para leer datos)
public String getTitular() {
    return titular;
}

public String getNumeroCuenta() {
    return numeroCuenta;
}

public double getSaldo() {
    return saldo;
}  

//Setters (para modificar datos de forma segura)
public void setTitular(String titular) {
    if(titular !=null && !titular.trim().isEmpty()){
        this.titular = titular;
    }else{
        System.out.println("ERROR. El nombre del titular no puede estar vacío.");  
    }
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


