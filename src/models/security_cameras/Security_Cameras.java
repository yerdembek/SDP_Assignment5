package models.security_cameras;

public interface Security_Cameras {
    public void recordingVideo();
    public void stopRecordingVideo();
    public void recordingAudio();
    public void stopRecordingAudio();
    public void onlineWatching();
    public void stopWatching();
}
