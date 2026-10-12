public class Contable implements Interesado{

    @Override
    public void notificarVenta(Compra compra) {
        System.out.println("Contable notificarVenta() ->" + compra);
    }
    
}
