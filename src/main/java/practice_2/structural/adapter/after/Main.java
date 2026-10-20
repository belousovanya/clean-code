package practice_2.structural.adapter.after;

public class Main {
    public static void main(String[] args) {
        FahrenheitThermometer fThermometer = new FahrenheitThermometer();
        WeatherApp app = new WeatherApp();

        CelsiusAdapter celsuisAdapter = new CelsiusAdapter(fThermometer);

        app.printTemperature(celsuisAdapter.getCelsius());
    }
}
