public class Rectangulo extends FiguraGeometrica {
    private double longitud;
    private double ancho;

    public Rectangulo(String nombre, String color, double longitud, double ancho) {
        super(nombre, color);
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return longitud * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }

    // Otros métodos, si es necesario
}
