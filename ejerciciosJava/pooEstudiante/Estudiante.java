//  todo: */ Ejercicio: Crea la clase Estudiante con los siguientes atributos y métodos: Atributo id Atributo edad Atributo telefono Atributo numeroDeNotas Atributo sumaDeNotas Atributo notaMedia Método mostrarInfo Método agregarNuevaNota

public class Estudiante {

    //! Atributos
    private int id;
    private int edad;
    private String telefono;
    private int numeroDeNotas;
    private float sumaDeNotas;
    private float notaMedia;

    public Estudiante(){
        this.id = 1;
        this.edad = 0;
        this.telefono = "+34 670 12 34 21";
        this.numeroDeNotas = 0;
        this.sumaDeNotas =  0;
        this.notaMedia = 0;

    }
    public Estudiante( int edad, String telefono){
        this.id = 1;
        this.edad = edad;
        this.telefono = telefono;
        this.numeroDeNotas = 0;
        this.sumaDeNotas =  0;
        this.notaMedia = 0;

    }
    public  Estudiante( int edad, String telefono, int numeroDeNotas, float sumaDeNotas, float notaMedia){
        this.id = 1;
        this.edad = edad;
        this.telefono = telefono;
        this.numeroDeNotas = numeroDeNotas;
        this.sumaDeNotas =  sumaDeNotas;
        this.notaMedia = notaMedia;

    }

    //! Métodos
    public void mostrarInfo(){
        System.out.println("Id: " + this.id);
        System.out.println("Edad: " + this.edad);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Numero de notas: " + this.numeroDeNotas);
        System.out.println("Suma de notas: " + this.sumaDeNotas);
        System.out.println("Nota media: " + this.notaMedia);
    }
    public void agregarNuevaNota(float nota){

        this.numeroDeNotas++;
        this.sumaDeNotas +=  nota;
        this.notaMedia = this.sumaDeNotas/this.numeroDeNotas;

    }
}



