import decorators.music_system_remote.Music_RemoteAccessDecorator;
import facades.Light_Facade;
import facades.Main_Facade;
import facades.Music_Facade;

public class Main {
    public static void main(String[] args){

        Main_Facade facade = new Main_Facade();
        facade.serveApp();
    }
}
