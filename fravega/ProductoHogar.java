public class ProductoHogar extends Producto {
    public ProductoHogar(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double aplicarImpuesto() {
        double valorFinal = getPrecioBase();
        
        Impuesto iva = new IVA();
        Impuesto el = new El(3.5);
        iva.setProducto(this);
        el.setProducto(this);
        double impuestoIVA = iva.calcularImpuesto();
        double impuestoEl = el.calcularImpuesto();
        
        valorFinal += impuestoEl;
        valorFinal += impuestoIVA; 

        return valorFinal;
    }
}
