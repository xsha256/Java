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
        



        
    }
}
