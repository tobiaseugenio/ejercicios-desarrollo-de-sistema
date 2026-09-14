public class Descuento extends Aplicable {
    private float descuento;

    @Override
    public float calcularPrecioFinal() {
        float precioProducto = super.producto.calcularPrecioFinal();        
        float precioParaDescontar = (precioProducto * descuento) / 100;
        return precioProducto - precioParaDescontar;
    }

    @Override
    public int calcularStockDisponible() {
        return super.producto.calcularStockDisponible();
    }
    
}
