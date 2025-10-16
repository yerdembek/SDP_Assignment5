package fasades.light;

import decorators.light.Hall_Light_VoiceControlDecorator;
import decorators.light.Light_VoiceControlDecorator;
import models.light.Hall_Light;
import models.light.Light;

public class Hall_Light_Fasade implements Light_Fasade {
    @Override
    public void serve_Light() {
        System.setProperty("org.vosk.LogLevel", "0");

        Light light = new Hall_Light();
        Light_VoiceControlDecorator voiceLight = new Hall_Light_VoiceControlDecorator(light);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        voiceLight.shutdown();
        System.out.println("End.");
    }
}