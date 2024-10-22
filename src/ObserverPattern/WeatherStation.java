package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherDisplay> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void addObserver(WeatherDisplay observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherDisplay observer) {
        observers.remove(observer);
    }

    public void notifyObservers(float temperature, float humidity, float pressure) {
        for (WeatherDisplay observer : observers)
            observer.update(temperature, humidity, pressure);
    }

    public void setWeatherData(float temperature, float humidity, float pressure) {
        notifyObservers(temperature, humidity, pressure);
    }
}
