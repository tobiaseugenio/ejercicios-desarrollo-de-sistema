public class Main {
    public static void main(String[] args) {
        ProductoSimple guantes = new ProductoSimple("Guantes", 10000, 50);
        ProductoSimple casco = new ProductoSimple("Casco", 20000, 25);
        ProductoSimple piloto = new ProductoSimple("Piloto", 25000, 100);
        ProductoSimple moto = new ProductoSimple("Moto", 1000000, 150);

        Combo comboSimple = new Combo("Combo simple");
        comboSimple.agregarProducto(guantes);
        comboSimple.agregarProducto(casco);
        comboSimple.mostrarProductos();

        Packaging p1 = new Packaging(guantes, 100);
        System.out.println("Precio guantes sin agregado: " + guantes.calcularPrecioFinal());
        System.out.println("Precio guantes con agregado: " + p1.calcularPrecioFinal());

        System.out.println("-------------------");

        Descuento d1 = new Descuento(guantes, 15);
        System.out.println("Precio guantes sin descuento: " + guantes.calcularPrecioFinal());
        System.out.println("Precio guantes con descuento: " + d1.calcularPrecioFinal());

        System.out.println("-------------------");

        Combo comboPrimavera = new Combo("Primavera");
        comboPrimavera.agregarProducto(moto);
        comboPrimavera.agregarProducto(guantes);
        comboPrimavera.agregarProducto(piloto);
        comboPrimavera.agregarProducto(casco);

        comboPrimavera.mostrarProductos();
        Descuento dCombo = new Descuento(comboPrimavera, 50);
        
        float precioSinDescuento = comboPrimavera.calcularPrecioFinal();
        float precioConDescuento = dCombo.calcularPrecioFinal();

        String sz = "Precio sin descuento = " + precioSinDescuento + "\n" + "Precio con descuento = "
                + precioConDescuento;
        System.out.println(sz);
    }
}
