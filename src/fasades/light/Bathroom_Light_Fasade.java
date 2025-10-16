package fasades.light;

import decorators.light.Bathroom_Light_VoiceControlDecorator;
import decorators.light.Light_VoiceControlDecorator;
import models.light.Bathroom_Light;
import models.light.Light;

public class Bathroom_Light_Fasade implements Light_Fasade {
    @Override
    public void serve_Light() {
        System.setProperty("org.vosk.LogLevel", "0");

        Light light = new Bathroom_Light();
        Light_VoiceControlDecorator voiceLight = new Bathroom_Light_VoiceControlDecorator(light);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        voiceLight.shutdown();
        System.out.println("End.");
    }
}
