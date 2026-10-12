public class ContadorVentas implements Interesado {

    @Override
    public void notificarVenta(Compra compra) {
        System.out.println("Contador de ventas notificarVenta() ->" + compra);
    }

}
