import java.util.HashSet;

public class Combo extends Producto {
    private String nombre;
    private HashSet<Producto> productos;
    

    public Combo(String nombre) {
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

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void borrarProducto(Producto p){
        productos.remove(p);
    }
     
    public void mostrarProductos(){
        System.out.println(getNombre());
        for (Producto producto : productos) {
            System.out.println(producto.toString() + " "); 
        }
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

    @Override
    public String toString() {
        return productos.toString();
    }
}
