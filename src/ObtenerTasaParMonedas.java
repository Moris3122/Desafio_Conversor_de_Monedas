import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ObtenerTasaParMonedas {

    private Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public void obtenerTasa(String monedaBase, String monedaDestino, String cantidad) {
        String ruta = "https://v6.exchangerate-api.com/v6/46a20b3f080666ac49f24b10/pair/" +
                monedaBase +"/" + monedaDestino + "/" + cantidad;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(ruta))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            TasaCambio tasaCambio = gson.fromJson(json, TasaCambio.class);

            System.out.println("========================================================");
            System.out.println("                    Conversión Final");
            System.out.println("                    ++++++++++++++++\n");
            System.out.println("Cambiar de: " + "[" + tasaCambio.getBaseCode() + "]" + " a: " + "[" + tasaCambio.getTargetCode() + "]");
            System.out.println("Tasa de conversión: " + tasaCambio.getConversionRate());
            System.out.println(cantidad + " [" + monedaBase + "]" + " equivalen a: " + tasaCambio.getConversionResult() + " [" + monedaDestino + "]");
            System.out.println("\n=======================================================");


        } catch (IOException | InterruptedException e) {
            System.out.println("Ocurrió un error al obtener la tasa de cambio.");
            e.printStackTrace();
        }
    }
}