package ObserverPattern;

public class StatisticsDisplay implements WeatherDisplay{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Weather statistics: " + temperature + "C temperature, "
                + humidity + "% humidity, "
                + pressure + "Pa pressure.");
    }
}
