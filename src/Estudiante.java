public class Estudiante extends Persona implements Trabajador {
    private String grado;

    // Constructor
    public Estudiante(String nombre, int edad, String fechaNacimiento, String grado) {
        // Llama al constructor de la clase Persona para inicializar las propiedades heredadas
        super(nombre, edad, fechaNacimiento);
        this.grado = grado;
    }

    // Método para obtener el grado del estudiante
    public String obtenerGrado() {
        return grado;
    }

    // Método para establecer el grado del estudiante
    public void establecerGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grado: " + grado;
    }
    @Override
    public void realizarTarea() {
        System.out.println("Realizando tarea escolar");
    }
}