import java.time.LocalDate;
import java.util.HashMap;

public class Compra {
    private HashMap<Producto, Integer> items;
    private LocalDate fecha;

    public Compra() {
        this.items = new HashMap<>();
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public HashMap<Producto, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<Producto, Integer> items) {
        this.items = items;
    }

    public void agregarProducto(Producto p, Integer cantidad) {
        items.put(p, cantidad);
    }

    @Override
    public String toString() {
        return items.toString();
    }

}
