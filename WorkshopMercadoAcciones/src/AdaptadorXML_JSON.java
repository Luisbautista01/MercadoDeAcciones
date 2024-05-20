import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class AdaptadorXML_JSON implements InterfazAnalizador{

    private InterfazAnalizador datosXML;

    public AdaptadorXML_JSON(InterfazAnalizador datosXML) {
        this.datosXML = datosXML;
    }

    @Override
    public String obtenerDatos(){
        String xml = datosXML.obtenerDatos();
        try {
            JSONObject jsonObject = XML.toJSONObject(xml);
            return  jsonObject.toString();
        } catch (JSONException e) {
            System.err.println("Error al convertir XML a JSON: " + e.getMessage());
            return "{}"; // Devuelve un JSON vacío en caso de error
        }
    }
}
