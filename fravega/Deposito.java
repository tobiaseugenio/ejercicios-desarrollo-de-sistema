public class Deposito implements Interesado {

    @Override
    public void notificarVenta(Compra compra) {
        System.out.println("Deposito notificarVenta() ->" + compra);
    }

}
