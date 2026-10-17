public class Main {
    public static void main(String[] args) {
        Documento d1 = new Documento(null, "Cadorna");
        PDF pdf = new PDF();
        Excel excel = new Excel();

        pdf.exportar(d1);
        excel.exportar(d1);

    }
}
