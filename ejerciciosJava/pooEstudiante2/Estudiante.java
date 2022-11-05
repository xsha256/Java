//  todo: */ Ejercicio: Crea la clase Estudiante con los siguientes atributos y métodos: Atributo id Atributo edad Atributo telefono Atributo numeroDeNotas Atributo sumaDeNotas Atributo notaMedia Método mostrarInfo Método agregarNuevaNota

public class Estudiante {

    //! Atributos
    private int id;
    private int edad;
    private String telefono;
    private int numeroDeNotas;
    private float sumaDeNotas;
    private float notaMedia;
    private float[] notas;

    // todo: un constructor por defecto 
    public Estudiante(){
        this.id = 1;
        this.edad = 0;
        this.telefono = "+34 670 12 34 21";
        this.numeroDeNotas = 0;
        this.sumaDeNotas =  0;
        this.notaMedia = 0;
        this.notas = new float[10];

        
    }

       // todo: dos constructores parametrizados (uno que incluya todos los atributos de la clase y asigne sus respectivos valores pasados por argumentos). Crea varias instancias de la clase a partir de los diferentes constructores.

       // * el primer constructor parametrizado (tiene dos argumentos)
    public Estudiante( int edad, String telefono){
        this.id = 1;
        this.edad = edad;
        this.telefono = telefono;
        this.numeroDeNotas = 0;
        this.sumaDeNotas =  0;
        this.notaMedia = 0;
        this.notas = new float[10];

    }

        // * el segundo constructor parametrizado (tiene cinco argumentos)
    public  Estudiante( int edad, String telefono, int numeroDeNotas, float sumaDeNotas, float notaMedia){
        this.id = 1;
        this.edad = edad;
        this.telefono = telefono;
        this.numeroDeNotas = numeroDeNotas;
        this.sumaDeNotas =  sumaDeNotas;
        this.notaMedia = notaMedia;
        this.notas = new float[10];

    }
    // todo: Añade los diferentes modificadores (private y public) a los atributos y métodos de la clase Estudiante. Crea los diferentes métodos get y set para cada uno de los atributos de la clase Estudiante.

    //* Get */
    public int getId() {
        return this.id;
    }
    public int getEdad() {
        return this.edad;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public int getNumeroDeNotas() {
        return this.numeroDeNotas;
    }
    public float getSumaDeNotas() {
        return this.sumaDeNotas;
    }
    public float getNotaMedia() {
        return this.notaMedia;
    }

        //* Set */

    public void setId(int id) {
        this.id = id;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setNumeroDeNota(int numeroDeNotas) {
        this.numeroDeNotas = numeroDeNotas;
    }
    public void setSumaDeNotas(float sumaDeNotas) {
        this.sumaDeNotas = sumaDeNotas;
    }
    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }


    //! Métodos
    public void mostrarInfo(){
        System.out.println("Id: " + this.id);
        System.out.println("Edad: " + this.edad);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Numero de notas: " + this.numeroDeNotas);
        System.out.println("Suma de notas: " + this.sumaDeNotas);
        System.out.println("Nota media: " + this.notaMedia + "\n");
    }
    public void agregarNuevaNota(float nota ){

        this.numeroDeNotas++;
        this.sumaDeNotas +=  nota;
        this.notaMedia = this.sumaDeNotas/this.numeroDeNotas;
        this.notas[numeroDeNotas - 1] = nota;

    }

    // todo: Crea un método estático público (de nombre crearEstudiante) que devuelva un objeto de tipo Estudiante inicializado con los valores asignados en el constructor por defecto.

    public static Estudiante crearEstudiante(){
        return new Estudiante();

    }

//   todo: Implementa tres métodos sobrecargados para agregarNuevaNota: Primer método: no recibe parámetros. Segundo método: recibe como parámetro una nota (valor de tipo flotante). Tercer método: recibe como parámetro una nota y una variable booleana para reiniciar a cero los atributos numeroDeNotas, sumaDeNotas y notaMedia. El funcionamiento general del método agregarNuevaNota es: Aumentar un valor el atributo numeroDeNotas. Sumar la nueva nota al atributo sumaDeNotas. Obtener el nuevo valor de notaMedia diviendo sumaDeNotas por numeroDeNotas.

//! reiniciarNotas como parametro
    public void agregarNuevaNota(float nota, boolean reiniciarNotas){
         if(reiniciarNotas){
            this.numeroDeNotas = 0;
            this.sumaDeNotas =  0;
            this.notaMedia = 0;
            // o llamamos directamente a la clase que creamos
            reiniciarNotas();
            // this.numeroDeNotas++;
            // this.sumaDeNotas +=  nota;
            // this.notaMedia = this.sumaDeNotas/this.numeroDeNotas;
        } else{
            this.numeroDeNotas++;
            this.sumaDeNotas +=  nota;
            this.notaMedia = this.sumaDeNotas/this.numeroDeNotas;
        }

    }

    //! reiniciarNotas como metodo
    public void reiniciarNotas(){
        this.numeroDeNotas = 0;
        this.sumaDeNotas =  0;
        this.notaMedia = 0;
    }


    //! compararMedia de dos estudiantes
    public static Estudiante CompararMedia(Estudiante e1, Estudiante e2){

        //* podemos utilizar la clase privada e1.notaMedia o la clase public (el metodo Get que creamos antes) e2.getNotaMedia() 
        if(e1.notaMedia > e2.getNotaMedia()){
                    return e1;
                } 
                return e2;

    }
    public void MostrarNotas(){
        for (int i=0; i < this.notas.length; i++){
            System.out.println(this.notas[i]);
    }



    }
}





