
// todo: Ejercicio: Crea la clase Estudiante con los siguientes atributos y métodos: Atributo id Atributo edad Atributo telefono Atributo numeroDeNotas Atributo sumaDeNotas Atributo notaMedia Método mostrarInfo Método agregarNuevaNota
import java.util.Scanner;

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

        //! Creacion estudiante 4
        Estudiante estudiante4  =  Estudiante.crearEstudiante();
        estudiante4.setId(4);
        estudiante4.setEdad(30);
        estudiante4.setNumeroDeNota(6);
        estudiante4.setSumaDeNotas(50);
        estudiante4.setNotaMedia(8.33f);
    


         //   todo: Implementa tres métodos sobrecargados para agregarNuevaNota: Primer método: no recibe parámetros. Segundo método: recibe como parámetro una nota (valor de tipo flotante). Tercer método: recibe como parámetro una nota y una variable booleana para reiniciar a cero los atributos numeroDeNotas, sumaDeNotas y notaMedia. El funcionamiento general del método agregarNuevaNota es: Aumentar un valor el atributo numeroDeNotas. Sumar la nueva nota al atributo sumaDeNotas. Obtener el nuevo valor de notaMedia diviendo sumaDeNotas por numeroDeNotas.
         //! reiniciarNotas como parametro
        //  estudiante3.mostrarInfo();
        //  estudiante3.agregarNuevaNota(6, true);
        //  estudiante3.mostrarInfo();

        //! reiniciarNotas como Metodo 
         System.out.println(" \n************Estudiante 4***************");
         estudiante4.mostrarInfo();
         System.out.println(" \n************Reiniciar notas Estudiante 4***************");

         estudiante4.reiniciarNotas();
         estudiante4.mostrarInfo();


        // todo 4. Implementar una clase programa (con main) para gestionar Estudiantes por consola y teclado.
        Scanner keyboard  = new Scanner(System.in);

        
       Estudiante estudiante = null;
       int menuSeleciona = -1;

       do {
            System.out.println("Elige una opcion");
            System.out.println("1. Crear un estudiante\n2. Visualizar el estudiante\n3. Añadir nueva nota al estudiante\n4. Reiniciar las notas del estudiante\n0. Salir");
            System.out.print("Opcion: ");
            menuSeleciona = keyboard.nextInt();
            switch(menuSeleciona){
                case 0: 
                    System.out.print("Saliendo...");
                    break;
                case 1:
                    System.out.println("Crear Estudiante");
                    estudiante = new Estudiante();
                    System.out.print("Id: ");
                    int nuevoId = keyboard.nextInt();
                    estudiante.setId(nuevoId);
                    System.out.print("Edad: ");
                    int nuevaEdad = keyboard.nextInt();
                    estudiante.setEdad(nuevaEdad);
                    System.out.print("Tel: ");
                    String nuevoTel = keyboard.next();
                    estudiante.setTelefono(nuevoTel);
                    System.out.print("Estudiante creado con Id: " + estudiante.getId() );
                    break;
                case 2:
                    System.out.print("Visualizar el estudiante");
                    if (estudiante != null){
                        estudiante.mostrarInfo();
                    } else {
                        System.out.print("Todavía no hay estudiante");
                    }
                    break;
                case 3: 
                        if(estudiante != null) { 
                            System.out.print("Añadir nueva nota al estudiante: ");
                            float nuevaNota = keyboard.nextFloat();
                            estudiante.agregarNuevaNota(nuevaNota);
                            System.out.print("Nota agregada");
                        } else {
                            System.out.print("Todavía no hay estudiante");
                        }
                        break;
                case 4: 
                        if (estudiante != null) {
                            System.out.print("Reiniciar las notas del estudiante");
                            estudiante.reiniciarNotas();
                            System.out.print("Notas reiniciadas");
                        } else {
                            System.out.println("Todavía no hay estudiante");
                        }
                        break;
                case 5: 
                        if (estudiante!= null) {
                            System.out.print("notas ");
                            estudiante.MostrarNotas(); 
                        } else{
                            System.out.print("Todavía no hay estudiante");
                        }
                default: 
                        System.out.print("Opcion incorrecta...");
                        break;
            }
       } while (menuSeleciona != 0);

        keyboard.close();








    }
}
