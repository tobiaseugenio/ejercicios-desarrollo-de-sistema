import java.util.HashSet;

public class Combo extends Producto {
    private String nombre;
    private HashSet<Producto> productos;
    

    public Combo(String nombre, HashSet<Producto> productos) {
        this.nombre = nombre;
        this.productos = new HashSet<>();
    }
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
     
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public HashSet<Producto> getProductos() {
        return productos;
    }
    public void setProductos(HashSet<Producto> productos) {
        this.productos = productos;
    }
}
