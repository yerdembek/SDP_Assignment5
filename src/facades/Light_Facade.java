package facades;

import decorators.light_voice.*;
import models.light.*;

public class Light_Facade {
    public void serve_Bathroom_Light() {

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

    public void serve_Bedroom_Light() {


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

    public void serve_Hall_Light() {
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

    public void serve_Kitchen_Light() {

        Light light = new Kitchen_Light();
        Light_VoiceControlDecorator voiceLight = new Kitchen_Light_VoiceControlDecorator(light);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        voiceLight.shutdown();
        System.out.println("End.");
    }
}
