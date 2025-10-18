package decorators.music_system_remote;

import models.music_system.Music_Inside;
import models.music_system.Music_System;

public class Music_Inside_RemoteAccessDecorator extends Music_RemoteAccessDecorator{
    Music_System music_system = new Music_Inside();
    public Music_Inside_RemoteAccessDecorator(Music_System music_system) {
        super(music_system);
        this.music_system = (Music_Inside) music_system;
    }
}
