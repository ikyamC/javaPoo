import java.time.LocalDate;

public class Persona {
    private String nombre;
    private int edad;
    private String fechaNacimiento;

    // Método para establecer el nombre
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el nombre
    public String obtenerNombre() {
        return nombre;
    }

    // Método para establecer la edad
    public void establecerEdad(int edad) {
        // Validación para asegurarnos de que la edad no sea negativa
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Método para obtener la edad
    public int obtenerEdad() {
        return edad;
    }

    // Método para establecer la fecha de nacimiento
    public void establecerFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para obtener la fecha de nacimiento
    public String obtenerFechaNacimiento() {
        return fechaNacimiento;
    }
    // Método para calcular la fecha de nacimiento a partir de la edad
    public void calcularFechaNacimiento() {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Restar la edad de la persona para calcular la fecha de nacimiento
        LocalDate fechaNacimientoCalculada = fechaActual.minusYears(edad);

        // Formatear la fecha de nacimiento calculada como una cadena
        this.fechaNacimiento = fechaNacimientoCalculada.toString();
    }

}

