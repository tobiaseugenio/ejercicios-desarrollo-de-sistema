public class El extends Impuesto {
    private double gananciaImpositiva;

    public El(double gananciaImpositiva) {
        this.gananciaImpositiva = gananciaImpositiva;
    }

    @Override
    public double calcularImpuesto() {
        // (precioBaseProducto/4) + 0,3 * GananciasImpositivas
        double precioBaseProducto = getProducto().getPrecioBase();
        double valorImpuesto = (precioBaseProducto / 4) + 0.3 * this.gananciaImpositiva;
        
        return valorImpuesto;
    }
}
