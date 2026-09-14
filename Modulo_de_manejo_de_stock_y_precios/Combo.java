import java.util.HashSet;

public class Combo extends Producto {
    private String nombre;
    private HashSet<Producto> productos;
    
    public float calcularPrecioFinal() {
        float precioFinal = 0;
        for (Producto producto : productos) {
            precioFinal += producto.calcularPrecioFinal();
        }
        return precioFinal;
    }
    public int calcularStockDisponible() {
        int stockDisponible = 0;
        for (Producto producto : productos) {
            stockDisponible += producto.calcularStockDisponible();
        }
        return stockDisponible;    
    }
}
