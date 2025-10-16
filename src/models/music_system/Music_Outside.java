package models.music_system;

import java.util.*;

public class Music_Outside implements Music_System{
    Scanner scan = new Scanner(System.in);
    private int volume = 50;
    private String song;


    @Override
    public void play() {
        System.out.println("Music_Outside play with volume " + getVolume());
    }

    @Override
    public void pause() {
        System.out.println("Music_Outside pause");
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
    public void setSong(int mode) {
        System.out.println("Write the name of song:\n");
        song = scan.nextLine();
    }

    @Override
    public String getSong() {
        return song;
    }
}
