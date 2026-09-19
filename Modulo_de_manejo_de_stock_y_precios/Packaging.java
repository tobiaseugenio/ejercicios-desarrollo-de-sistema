public class Packaging extends Aplicable {
    private float agregado;

    public Packaging(Producto producto, float agregado) {
        setProducto(producto);
        this.agregado = agregado;
    }

    @Override
    public float calcularPrecioFinal() {
        float precioProducto = producto.calcularPrecioFinal();        
        return precioProducto + agregado;
    }

    @Override
    public int calcularStockDisponible() {
        return producto.calcularStockDisponible();    
    }
    
}
