package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherData weatherData = new WeatherData(weatherStation);

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.addObserver(currentConditionsDisplay);
        weatherStation.addObserver(statisticsDisplay);
        weatherStation.addObserver(forecastDisplay);

        weatherData.setWeatherData(8.5f, 85.0f, 727.0f); // From Gismeteo :D
        weatherData.setWeatherData(6.0f, 90.0f, 728.0f);
    }
}
