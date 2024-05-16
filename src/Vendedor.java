public class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        // El salario del vendedor incluye el salario base más la comisión
        return super.calcularSalario() + comision;
    }

    // Otros métodos, si es necesario
}
