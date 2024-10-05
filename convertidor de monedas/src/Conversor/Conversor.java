package Conversor;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Conversor {
    public Conversor(String bfdbd23b0490710ff6f581af) {
    }

    public double convertirMoneda(String monedaOrigen, String monedaDestino, double valor) throws IOException, InterruptedException {

        String url = "https://api.exchangerate-api.com/v4/latest/" + monedaOrigen;


        HttpClient cliente = HttpClient.newHttpClient();

        // Crear la solicitud HTTP
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Enviar la solicitud y obtener la respuesta
        HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());


        JSONObject respuestaJson = new JSONObject(respuesta.body());
        JSONObject tasas = respuestaJson.getJSONObject("rates");

        // Obtener la tasa de cambio de la moneda de destino
        double tasaCambio = tasas.getDouble(monedaDestino);

        // Retornar el valor convertido
        return valor * tasaCambio;
    }

  }

