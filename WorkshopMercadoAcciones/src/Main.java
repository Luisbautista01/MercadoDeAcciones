public class Main {
    public static void main(String[] args) {

        InterfazAnalizador datosXML = new DatosXML();
        InterfazAnalizador adapter = new AdaptadorXML_JSON(datosXML);
        LibreriaTerceros libreriaTerceros = new LibreriaTerceros();

        String datosJSON = adapter.obtenerDatos();
        libreriaTerceros.procesarDatos(datosJSON);

    }
}