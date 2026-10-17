import java.util.List;
import java.util.Map;

public class Documento {
    public Map<String, List<String>> map;
    public String nombre;

    public Documento(Map<String, List<String>> map, String nombre) {
        this.map = map;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<String>> map) {
        this.map = map;
    }

}
