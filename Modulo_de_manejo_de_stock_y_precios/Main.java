import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ProductoSimple guantes = new ProductoSimple("Guantes", 10000, 50);
        ProductoSimple casco = new ProductoSimple("Casco", 20000, 25);
        
        HashSet productosComboSimple1 = new HashSet<>();
        productosComboSimple1.add(guantes);
        productosComboSimple1.add(casco);

        Combo comboSimple = new Combo("Combo simple", productosComboSimple1);

    }
}
