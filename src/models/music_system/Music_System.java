package models.music_system;

public interface Music_System {
    public void play();
    public void pause();
    public void changeVolume(int newVolume);
    public int getVolume();
    public void setSong(String song);
    public String getSong();
    public String toString();
}
