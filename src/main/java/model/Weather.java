package Model;

public class Weather {

    private String city;
    private String iconUrl;
    private double temperature;
    private double feeldslikeC;
    private String conditionText;

    public Weather() {
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeeldslikeC() {
        return feeldslikeC;
    }

    public void setFeeldslikeC(double feeldslikeC) {
        this.feeldslikeC = feeldslikeC;
    }

    public String getConditionText() {
        return conditionText;
    }

    public void setConditionText(String conditionText) {
        this.conditionText = conditionText;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", temperature=" + temperature +
                ", feeldslikeC=" + feeldslikeC +
                ", conditionText='" + conditionText + '\'' +
                '}';
    }
}