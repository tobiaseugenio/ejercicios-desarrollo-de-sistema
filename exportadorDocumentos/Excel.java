public class Excel extends Adapter{

    @Override
    public void exportar(Documento documento) {
        darFormato(documento);
    }

    @Override
    protected void darFormato(Documento documento) {
        System.out.println("El documento " + documento.getNombre() + " fue convertido a Excel");
    }
    
}
