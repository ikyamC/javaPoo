public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        // El salario del gerente incluye el salario base más el bono
        return super.calcularSalario() + bono;
    }

    // Otros métodos, si es necesario
}
