import fasades.light.Bathroom_Light_Fasade;
import fasades.light.Light_Fasade;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Light_Fasade bathroom = new Bathroom_Light_Fasade();
        bathroom.serve_Light();
    }
}
