package fasades.light;

import decorators.light_voice.Bedroom_Light_VoiceControlDecorator;
import decorators.light_voice.Light_VoiceControlDecorator;
import models.light.Bedroom_Light;
import models.light.Light;

public class Bedroom_Light_Fasade implements Light_Fasade {
    @Override
    public void serve_Light() {
        System.setProperty("org.vosk.LogLevel", "0");

        Light light = new Bedroom_Light();
        Light_VoiceControlDecorator voiceLight = new Bedroom_Light_VoiceControlDecorator(light);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        voiceLight.shutdown();
        System.out.println("End.");
    }
}