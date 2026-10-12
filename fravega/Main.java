public class Main {
    public static void main(String[] args) {
        Producto alcachofa = new ProductoHogar("Alcachofa", 900);
        Producto vitrola = new ProductoElectronico("Vitrola", 10000);

        Compra compra = new Compra();

        compra.agregarProducto(vitrola, 3);
        compra.agregarProducto(alcachofa, 1);

        Deposito deposito = new Deposito();
        ContadorVentas contadorVentas = new ContadorVentas();
        Contable contable = new Contable();

        Observable observable = new Observable();

        observable.agregarObsevador(contable);
        observable.agregarObsevador(deposito);
        observable.agregarObsevador(contadorVentas);

        observable.notificar(compra);

        // System.out.println(vitrola.getPrecioBase());
        // System.out.println(vitrola.aplicarImpuesto());

        // System.out.println("---------------------");

        // System.out.println(alcachofa.getPrecioBase());
        // System.out.println(alcachofa.aplicarImpuesto());


    }
}
