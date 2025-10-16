package decorators.light;

import javax.sound.sampled.*;

import models.light.Light;
import org.vosk.Model;
import org.vosk.Recognizer;


public abstract class Light_VoiceControlDecorator implements Light{

    private final Light light;
    private TargetDataLine microphone;
    private Model model;
    protected Recognizer recognizer;

    public Light_VoiceControlDecorator(Light light) {
        this.light = light;
        setupMicrophone();
        initSpeechRecognizer();
        startListening();
    }

    protected void setupMicrophone() {
        AudioFormat format = new AudioFormat(
                AudioFormat.Encoding.PCM_SIGNED,
                16000.0f,   // частота дискретизации
                16,         // бит на выборку
                1,          // каналы (моно)
                2,          // frame size = 16 бит * 1 канал / 8 = 2 байта
                16000.0f,   // частота фреймов
                false       // little-endian
        );

        DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

    if (!AudioSystem.isLineSupported(info)) {
        throw new RuntimeException("Microphone is not supported");
    }
        try {
            microphone = (TargetDataLine) AudioSystem.getLine(info);
            microphone.open(format);
            microphone.start();
            System.out.println("Microphon is successfully started");
        } catch (LineUnavailableException e) {
            throw new RuntimeException("Failed to open microphone", e);
        }
    }

    protected void initSpeechRecognizer() {
        try {
            model = new Model("model");
            recognizer = new Recognizer(model, 16000.0f);
        } catch (Exception e) {
            throw new RuntimeException("Vosk was not initialized", e);
        }
    }

    public void startListening() {
        Thread audioThread = new Thread(() -> {
            byte[] buffer = new byte[4096];
            while (!Thread.currentThread().isInterrupted()) {
                int bytesRead = microphone.read(buffer, 0, buffer.length);
                if (bytesRead > 0) {
                    processAudioChunk(buffer, bytesRead);
                }
            }
        });
        audioThread.setDaemon(true);
        audioThread.start();
        System.out.println("Start...");
    }

    public void process(byte[] audioData, int length){

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

            }
        }
    }

    private void processAudioChunk(byte[] audioData, int length) {
        long sum = 0;
        for (int i = 0; i < length; i += 2) {
            short sample = (short) ((audioData[i + 1] << 8) | (audioData[i] & 0xFF));
            sum += Math.abs(sample);
        }
        double avg = sum / (length / 2);
        if (avg > 300) {
            System.out.println("Sound lvl: " + (int) avg);
        }

        process(audioData, length);
    }

    public void shutdown() {
        if (microphone != null && microphone.isOpen()) {
            microphone.stop();
            microphone.close();
        }
        if (recognizer != null) {
            recognizer.close();
        }
        if (model != null) {
            model.close();
        }
    }

    @Override
    public String turnOn() {
        return light.turnOn();
    }

    @Override
    public String turnOff() {
        return light.turnOff();
    }

    @Override
    public String toString() {
        return light.toString();
    }


}
