import java.util.Map;

public class Moneda {
    private String result;
    private String base_code;
    private Map<String, Double> conversion_rates;

    // Constructor
    public Moneda(String result, String base_code, Map<String, Double> conversion_rates) {
        this.result = result;
        this.base_code = base_code;
        this.conversion_rates = conversion_rates;
    }

    // Getters y Setters
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
