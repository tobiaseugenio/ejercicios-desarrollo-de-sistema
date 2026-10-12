public class EO extends Impuesto {
    private double gananciaImpositiva;

    public EO(double gananciaImpositiva) {
        this.gananciaImpositiva = gananciaImpositiva;
    }

    @Override
    public double calcularImpuesto() {
        // (0,5*precioBaseProducto)/(4*Gananciasimpositivas)
        double precioBaseProducto = getProducto().getPrecioBase();
        double valorImpuesto = (0.5 * precioBaseProducto) / (4 * this.gananciaImpositiva);
        return valorImpuesto;
    }
}
