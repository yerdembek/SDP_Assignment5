package decorators.music_system_remote;

//we don't need music_system_voice because wen music is playing system can not detect the voice

import models.music_system.Music_Outside;
import models.music_system.Music_System;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public abstract class Music_RemoteAccessDecorator implements Music_System {
    Scanner scanner = new Scanner(System.in);
    Music_System music_system;

    Music_RemoteAccessDecorator(Music_System music_system) {
        this.music_system = music_system;
    }

    @Override
    public void play() {
        music_system.play();
    }

    @Override
    public void pause() {
        music_system.pause();
    }

    int newVolume = scanner.nextInt();
    @Override
    public void changeVolume(int newVolume) {
        music_system.changeVolume(newVolume);
    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void setSong(String song) {
        music_system.setSong(song);
    }

    @Override
    public String getSong() {
        return "";
    }
}
