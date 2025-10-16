package decorators.light;

import models.light.Bedroom_Light;
import models.light.Light;
import org.vosk.Recognizer;

public class Bedroom_Light_VoiceControlDecorator extends Light_VoiceControlDecorator {
    private final Bedroom_Light light;

    public Bedroom_Light_VoiceControlDecorator(Light light) {
        super(light);
        this.light = (Bedroom_Light) light;
    }

    @Override
    public void process(byte[] audioData, int length) {
        if (recognizer.acceptWaveForm(audioData, length)) {
            String result = recognizer.getResult();
            System.out.println("Recognized: " + result);

            if (result.toLowerCase().contains("turn on") ||
                    result.toLowerCase().contains("light on") ||
                    result.toLowerCase().contains("on")) {
                System.out.println(light.toString());
                System.out.println(light.turnOn());

            } else if (result.toLowerCase().contains("turn off") ||
                    result.toLowerCase().contains("light off") ||
                    result.toLowerCase().contains("off")) {
                System.out.println(light.toString());
                System.out.println(light.turnOff());

            } else if (result.toLowerCase().contains("power up")||
                    result.toLowerCase().contains("up")) {
                System.out.println(light.toString());
                System.out.println(light.lightControl(20));
            }else if (result.toLowerCase().contains("power down")||
                    result.toLowerCase().contains("down")) {
                System.out.println(light.toString());
                System.out.println(light.lightControl(-20));
            } else  if  (result.toLowerCase().contains("night") && result.toLowerCase().contains("on")) {
                System.out.println(light.toString());
                light.turnOnNightLight();
                System.out.println(light.nightLightToString());
            } else if (result.toLowerCase().contains("night") && result.toLowerCase().contains("off")) {
                System.out.println(light.toString());
                light.turnOffNightLight();
                System.out.println(light.nightLightToString());
            }
        }
    }
}
