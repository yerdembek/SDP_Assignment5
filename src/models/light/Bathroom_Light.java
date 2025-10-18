package models.light;

public class Bathroom_Light implements Light{
    private int lightPower = 0;


    public void lightControl(int n){
        if(lightPower == 0){
            lightPower = 0;                           //first we need to turn on light to control his power

        } else if (lightPower == 100){
            lightPower = (lightPower + n) - 100;      //we can not out of 100
        } else {
            lightPower = lightPower + n;
        }
        System.out.println("Bathroom Light power: " + lightPower);
    }

    @Override
    public String turnOn() {
        if  (lightPower == 0){
            lightPower = 100;
        }
        return "Bathroom Light is turn on and light power is " + lightPower;
    }

    @Override
    public String turnOff() {
        lightPower = 0;
        return "Bathroom Light is turn off and light power is " + lightPower;
    }

    @Override
    public String toString() {
        return "Bathroom_Light has a power of light";
    }
}
