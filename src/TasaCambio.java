import com.google.gson.annotations.SerializedName;

public class TasaCambio {
    @SerializedName("base_code")
    private String BaseCode;

    @SerializedName("target_code")
    private String TargetCode;

    @SerializedName("conversion_rate")
    private double ConversionRate;

    @SerializedName("conversion_result")
    private double ConversionResult;

    // Getters y Setters
    public String getBaseCode() {
        return BaseCode;
    }

    public String getTargetCode() {
        return TargetCode;
    }

    public double getConversionRate() {
        return ConversionRate;
    }

    public double getConversionResult() {
        return ConversionResult;
    }

    @Override
    public String toString() {
        return "TasaCambio{" +
                "BaseCode='" + BaseCode + '\'' +
                ", TargetCode='" + TargetCode + '\'' +
                ", ConversionRate=" + ConversionRate +
                ", ConversionResult=" + ConversionResult +
                '}';
    }
}
