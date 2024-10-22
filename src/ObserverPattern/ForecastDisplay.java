package ObserverPattern;

public class ForecastDisplay implements WeatherDisplay {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Weather forecast: " + temperature + "C temperature, "
                + humidity + "% humidity, "
                + pressure + "Pa pressure.");
    }
}
