package decorators.light_voice;

import models.light.Hall_Light;
import models.light.Light;

public class Hall_Light_VoiceControlDecorator extends Light_VoiceControlDecorator{
    private final Hall_Light light;

    public Hall_Light_VoiceControlDecorator(Light light) {
        super(light);
        this.light = (Hall_Light) light;
    }

    @Override
    public void process(byte[] audioData, int length) {
        if (recognizer.acceptWaveForm(audioData, length)) {
            String result = recognizer.getResult();
            System.out.println(light.toString());
            System.out.println("Recognized: " + result);

            if (result.toLowerCase().contains("turn on") ||
                    result.toLowerCase().contains("light on") ||
                    result.toLowerCase().contains("on")) {
                System.out.println(light.turnOn());

            } else if (result.toLowerCase().contains("turn off") ||
                    result.toLowerCase().contains("light off") ||
                    result.toLowerCase().contains("off")) {
                System.out.println(light.turnOff());

            } else if (result.toLowerCase().contains("one")) {
                light.changeMode(0);
                System.out.println(light.toString());
            } else  if (result.toLowerCase().contains("two")) {
                light.changeMode(1);
                System.out.println(light.toString());
            } else  if (result.toLowerCase().contains("three")) {
                light.changeMode(2);
                System.out.println(light.toString());
            }  else  if (result.toLowerCase().contains("four")) {
                light.changeMode(3);
                System.out.println(light.toString());
            } else  if (result.toLowerCase().contains("five")) {
                light.changeMode(4);
                System.out.println(light.toString());
            }

        }
    }
}
