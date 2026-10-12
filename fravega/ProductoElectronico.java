public class ProductoElectronico extends Producto {
    public ProductoElectronico(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    public double aplicarImpuesto(){
        double valorFinal = getPrecioBase();
        
        Impuesto iva = new IVA();
        Impuesto eo = new EO(4);
        iva.setProducto(this);
        eo.setProducto(this);
        double impuestoIVA = iva.calcularImpuesto();
        double impuestoEO = eo.calcularImpuesto();
        
        valorFinal += impuestoEO;
        valorFinal += impuestoIVA; 

        return valorFinal;
    }
}
