package facades;

import decorators.music_system_remote.Music_Inside_RemoteAccessDecorator;
import decorators.music_system_remote.Music_Outside_RemoteAccessDecorator;
import decorators.music_system_remote.Music_RemoteAccessDecorator;
import models.music_system.Music_Inside;
import models.music_system.Music_Outside;
import models.music_system.Music_System;

import java.util.Scanner;

public class Music_Facade {
    Scanner scanner = new Scanner(System.in);

    public void serve_Inside_Music(){
        Music_System music = new Music_Inside();
        Music_RemoteAccessDecorator remote = new Music_Inside_RemoteAccessDecorator(music);
        System.out.println("------Inside music system------\nChoose option: \n1. play\n2. pause\n3. changeVolume\n4. getVolume\n5. setSong \n6. getSong");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> music.play();
            case 2 -> music.pause();
            case 3 -> music.changeVolume(scanner.nextInt());
            case 4 -> music.getVolume();
            case 5 -> music.setSong(scanner.next());
            case 6 -> music.getSong();
            default -> System.out.println("Invalid choice");
        }
    }

    public void serve_Outside_Music(){
        Music_System music = new Music_Outside();
        Music_RemoteAccessDecorator remote = new Music_Outside_RemoteAccessDecorator(music);
        System.out.println("------Outside music system------\nChoose option: \n1. play\n2. pause\n3. changeVolume\n4. getVolume\n5. setSong \n6. getSong");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> music.play();
            case 2 -> music.pause();
            case 3 -> music.changeVolume(scanner.nextInt());
            case 4 -> music.getVolume();
            case 5 -> music.setSong(scanner.next());
            case 6 -> music.getSong();
            default -> System.out.println("Invalid choice");
        }
    }
}
