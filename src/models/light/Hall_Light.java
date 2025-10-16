package models.light;

public class Hall_Light implements Light {
    private String[] modes = {"light", "dark", "cinema", "sunshine", "disco"};
    private String mode = modes[0];

    public void changeMode(int n) {
        mode =  modes[n-1];
    }

    @Override
    public String turnOn() {
        return "Hall Light is turn on by mode " + mode;
    }

    @Override
    public String turnOff() {
        return "Hall Light is turn off";
    }

    @Override
    public String toString() {
        return "Hall Light has a modes like:" +
                "1. light" +
                "2. dark" +
                "3. cinema" +
                "4. sunshine" +
                "5. disco" +
                "now mod is: " + mode;
    }
}
