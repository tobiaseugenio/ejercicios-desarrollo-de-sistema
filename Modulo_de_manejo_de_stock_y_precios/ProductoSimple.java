public class ProductoSimple extends Producto {
    private String nombre;
    private float precioUnitario;
    private int stockDisponible;
    
    public ProductoSimple(String nombre, float precioUnitario, int stockDisponible) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.stockDisponible = stockDisponible;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public float calcularPrecioFinal() {
        return this.precioUnitario;    
    }
    public int calcularStockDisponible() {
        return this.stockDisponible;    
    }
}
