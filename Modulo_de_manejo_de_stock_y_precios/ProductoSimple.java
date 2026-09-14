public class ProductoSimple extends Producto {
    private String nombre;
    private float precioUnitario;
    private int stockDisponible;
    
    public float calcularPrecioFinal() {
        return this.precioUnitario;    
    }
    public int calcularStockDisponible() {
        return this.stockDisponible;    
    }
}
