import fasades.light.Bathroom_Light_Fasade;
import fasades.light.Hall_Light_Fasade;
import fasades.light.Light_Fasade;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Light_Fasade light = new Hall_Light_Fasade();
        light.serve_Light();
    }
}
