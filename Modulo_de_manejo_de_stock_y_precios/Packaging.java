public class Packaging extends Aplicable {
    private float agregado;

    @Override
    public float calcularPrecioFinal() {
        float precioProducto = super.producto.calcularPrecioFinal();        
        return precioProducto + agregado;
    }

    @Override
    public int calcularStockDisponible() {
        return super.producto.calcularStockDisponible();    
    }
    
}
