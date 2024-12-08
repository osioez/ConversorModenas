import java.util.Map;

public class Conversor {
    private final ExchangeRateAPI api;

    // Constructor
    public Conversor() {
        this.api = new ExchangeRateAPI();
    }

    // Método para convertir una cantidad de la moneda base a la moneda destino.
    public double convertirMoneda(String base_code, String target_code, double cantidad) {
        // Consultamos las tasas de cambio para la moneda base
        Moneda moneda = api.consultaPorMoneda(base_code);

        // Verificamos si la consulta fue exitosa
        if (!moneda.getResult().equals("success")) {
            throw new RuntimeException("No se pudo obtener las tasas de cambio.");
        }

        // Obtenemos la tasa de conversión para la moneda destino
        Map<String, Double> tasas = moneda.getConversion_rates();
        Double tasaConversion = tasas.get(target_code);

        if (tasaConversion == null) {
            throw new RuntimeException("No se encuentra la tasa de cambio para la moneda destino: " + target_code);
        }

        // Convertimos la cantidad
        return cantidad * tasaConversion;
    }
}
