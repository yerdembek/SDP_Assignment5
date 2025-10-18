package decorators.music_system_remote;

import models.music_system.Music_Inside;
import models.music_system.Music_Outside;
import models.music_system.Music_System;

public class Music_Outside_RemoteAccessDecorator extends Music_RemoteAccessDecorator{
    Music_System music_system = new Music_Inside();
    public Music_Outside_RemoteAccessDecorator(Music_System music_system) {
        super(music_system);
        this.music_system = (Music_Outside) music_system;
    }
}
