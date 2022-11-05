// todo: Ejercicio: Crea la clase Estudiante con los siguientes atributos y métodos: Atributo id Atributo edad Atributo telefono Atributo numeroDeNotas Atributo sumaDeNotas Atributo notaMedia Método mostrarInfo Método agregarNuevaNota

public class Main {
    
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarInfo();
        
        Estudiante estudiante2 = new Estudiante(16, "+34 567 67 56 78");
        estudiante2.mostrarInfo();

        Estudiante estudiante3 = new Estudiante(15, "+34 567 67 56 78", 4, 35.0f, 8.75f);
        estudiante3.mostrarInfo();

        estudiante3.agregarNuevaNota(6);
        estudiante3.mostrarInfo();

        // * Cambiar edadEstudiante3
        int edadEstudiante3 = estudiante3.getEdad();
        System.out.printf("Edad estudiante3: %d", edadEstudiante3).println();
        
        estudiante3.setEdad(20);
        edadEstudiante3 = estudiante3.getEdad();
        System.out.printf("El nuevo Edad estudiante3: %d", edadEstudiante3 ).println();

        // * Cambiar telefonoEstudiante2
        String telefonoEstudiante2 = estudiante2.getTelefono();
        System.out.printf("\nTelefono estudiante 2: %s", telefonoEstudiante2).println();

        estudiante2.setTelefono("+34 500 00 00 01");
        telefonoEstudiante2 = estudiante2.getTelefono();
        System.out.printf("El nuevo telefono estudiante 2: %s", telefonoEstudiante2).println();

         // todo: Crea un método estático público (de nombre crearEstudiante) que devuelva un objeto de tipo Estudiante inicializado con los valores asignados en el constructor por defecto.
        System.out.println(" \n***************************");
        Estudiante estudiante4  =  Estudiante.crearEstudiante();
        System.out.println("info del estudiante4: ");
        estudiante4.mostrarInfo();

         //   todo: Implementa tres métodos sobrecargados para agregarNuevaNota: Primer método: no recibe parámetros. Segundo método: recibe como parámetro una nota (valor de tipo flotante). Tercer método: recibe como parámetro una nota y una variable booleana para reiniciar a cero los atributos numeroDeNotas, sumaDeNotas y notaMedia. El funcionamiento general del método agregarNuevaNota es: Aumentar un valor el atributo numeroDeNotas. Sumar la nueva nota al atributo sumaDeNotas. Obtener el nuevo valor de notaMedia diviendo sumaDeNotas por numeroDeNotas.
         estudiante3.mostrarInfo();
         estudiante3.agregarNuevaNota(6, true);
         estudiante3.mostrarInfo();
       
        
    }

   

}
