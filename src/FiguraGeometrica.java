public abstract class FiguraGeometrica {
    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    // Getters y setters
    // ...
}
