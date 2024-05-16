
public class Empleado {
    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        // El salario base es el mismo para todos los empleados
        return salarioBase;
    }

    // Getters y setters, si es necesario
}
