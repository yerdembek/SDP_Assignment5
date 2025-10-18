package models.music_system;

import java.util.*;

public class Music_Inside implements Music_System {
    Scanner scan = new Scanner(System.in);
    private int volume = 50;
    private String song = "disco";


    @Override
    public void play() {
        System.out.println("Music Inside is " + song +" play with volume " + getVolume());
    }

    @Override
    public void pause() {
        System.out.println("Music_Inside pause");
    }

    @Override
    public void changeVolume(int newVolume) {
        volume = newVolume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setSong(String song) {
        this.song = song;
        System.out.println("Music_Inside set song " + song);
    }

    @Override
    public String getSong() {
        return song;
    }
}
