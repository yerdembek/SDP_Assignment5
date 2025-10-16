package models.thermostat;

public class Bedroom_Thermostat implements Thermostat{
    private int temperature = 17;

    @Override
    public int getTemperature() {
        return temperature;
    }
    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Bedroom_Thermostat{" + "temperature=" + temperature + '}';
    }
}
