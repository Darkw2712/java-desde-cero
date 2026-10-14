public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;

    //Constructor
    public Empleado(String nombre, String puesto, double salarioInicial){
        this.nombre = nombre;
        this.puesto = puesto;
        if(salarioInicial >= 0){
            this.salario = salarioInicial;
        }else{
            this.salario = 0;
        }
    }

    //getters para leer datos de forma segura
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public double getSalario() {
        return salario;
    }

    //setters para modificar datos de forma segura
    public void setSalario(double nuevoSalario){
        if(nuevoSalario >0){
            this.salario = nuevoSalario;//Se actualiza el salario si es mayor a cero
        }else{
            System.out.println("ERROR. El salario debe ser mayor a cero.");
        }
    }

    public void setNombre(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }else{
            System.out.println("ERROR. El nombre no puede estar vacío.");
        }
    }

   public void aumentarSalario(double porcentaje) { // <-- Aquí 'porcentaje' toma el valor 10.0
    if (porcentaje > 0) {
        double aumento = this.salario * (porcentaje / 100.0);
        this.salario += aumento;
        System.out.println("¡Aumento del " + porcentaje + "% aplicado! Nuevo salario: $" + this.salario);
    } else {
        System.out.println("ERROR: El porcentaje debe ser mayor a 0.");
    }
 }
}