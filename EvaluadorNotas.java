public class EvaluadorNotas{
    public static void main(String[] args){
        int nota=50;
        boolean asistencia = true;

        if(nota>60 && asistencia){
            System.out.println("Aprobado");
         } else if (nota<60 && asistencia){
                System.out.println("Reprobado");
               } else {
                    System.out.println("No asistió a clases");
                }
            
        
            }
    
}