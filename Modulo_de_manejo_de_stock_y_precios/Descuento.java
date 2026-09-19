public class Descuento extends Aplicable {
    private float descuento;

    public Descuento(Producto producto, float descuento) {
        setProducto(producto);
        this.descuento = descuento;
    }

    @Override
    public float calcularPrecioFinal() {
        float precioProducto = producto.calcularPrecioFinal();        
        float precioParaDescontar = (precioProducto * descuento) / 100;
        return precioProducto - precioParaDescontar;
    }

    @Override
    public int calcularStockDisponible() {
        return producto.calcularStockDisponible();
    }
}
