import java.util.ArrayList;

public class Observable {
    private ArrayList<Interesado> observadores;
    
    public Observable() {
        this.observadores = new ArrayList<Interesado>();
    }


    public void notificar(Compra compra){
        for (Interesado interesado : observadores) {
            interesado.notificarVenta(compra);
        }
    }

    public void agregarObsevador(Interesado i){
        observadores.add(i);
    }

    public void eliminarObservador(Interesado i){
        observadores.remove(i);
    }
}
