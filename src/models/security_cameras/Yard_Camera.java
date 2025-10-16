package models.security_cameras;

public class Yard_Camera implements Security_Cameras{
    private String cameraName = "yard cam";

    @Override
    public void recordingVideo() {
        System.out.println("Recording Video with " + cameraName + "🟢");
    }

    @Override
    public void stopRecordingVideo() {
        System.out.println("Stop Recording Video with " + cameraName + "🔴");
    }

    @Override
    public void recordingAudio() {
        System.out.println("Recording Audio with " + cameraName + "🟢");
    }

    @Override
    public void stopRecordingAudio() {
        System.out.println("Stop Recording Audio with " + cameraName + "🔴");
    }

    @Override
    public void onlineWatching() {
        System.out.println("Online Watching with " + cameraName + "🟢");
    }

    @Override
    public void stopWatching() {
        System.out.println("Stop Watching with " + cameraName + "🔴");
    }
}
