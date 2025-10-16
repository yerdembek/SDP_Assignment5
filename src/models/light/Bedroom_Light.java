package models.light;

public class Bedroom_Light implements Light {
    private boolean nightLight =false;
    private int lightPower = 0;

    public int lightControl(int n){
        if(lightPower == 0){
            return 0;                           //first we need to turn on light to control his power
        } else if (lightPower == 100){
            return (lightPower + n) - 100;      //we can not out of 100
        }
        return lightPower + n;
    }

    public void turnOnNightLight(){
        nightLight=true;
    }
    public void turnOffNightLight(){
        nightLight=false;
    }
    public String nightLightToString(){
        if(nightLight){return "\nNight Light is on";} else{return "\nNight Light is off";}
    }

    @Override
    public String turnOn() {
        lightPower = 100;
        return "Bedroom Light is turn on, power is " + lightPower + nightLightToString();
    }

    @Override
    public String turnOff() {
        lightPower = 0;
        return "Bedroom Light is turn off, power is " + lightPower + nightLightToString();
    }

    @Override
    public String toString() {
        return "Bedroom_Light has power and night light";
    }
}
