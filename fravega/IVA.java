public class IVA extends Impuesto {
    private double porcentaje = 0.21;

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularImpuesto() {
        // 0,21 * precioBaseProducto 
        double precioBaseProducto = getProducto().getPrecioBase();
        double valorImpuesto = precioBaseProducto * this.porcentaje;
        return valorImpuesto;
    }
}
