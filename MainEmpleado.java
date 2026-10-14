public class MainEmpleado {
    public static void main(String[] args) {
        Empleado colaborador = new Empleado("Laura restrepo", "Desarrolladora Java", 2500.00);
        System.out.println("Nombre: " + colaborador.getNombre());
        System.out.println("Puesto: " + colaborador.getPuesto());
        System.out.println("Salario: "+ colaborador.getSalario());

        System.out.println("--- PRUEBA DE VALIDACION DE SALARIO ---");
        colaborador.setSalario(-3300.0);

         System.out.println("--- APLICANDO AUMENTO DE SALARIO (10%) ---");
         colaborador.aumentarSalario(10.0);
    }
}
