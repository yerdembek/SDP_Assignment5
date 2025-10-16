package models.light;

public class Kitchen_Light implements Light {

    @Override
    public String turnOn() {
        return "Bathroom Light is turn off";
    }

    @Override
    public String turnOff() {

        return "Bathroom Light is turn off";
    }

    @Override
    public String toString() {
        return "Bathroom_Light has a power of light";
    }
}
