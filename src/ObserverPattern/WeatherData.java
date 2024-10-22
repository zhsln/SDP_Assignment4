package ObserverPattern;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherStation weatherStation;

    public WeatherData(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        weatherStation.setWeatherData(temperature, humidity, pressure);
    }

    // Getters
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
