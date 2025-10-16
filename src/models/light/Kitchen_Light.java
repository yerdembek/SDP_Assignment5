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
        return "Kitche light has nit a power of light";
    }
}
