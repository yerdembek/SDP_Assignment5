import facades.Light_Facade;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Light_Facade light = new Light_Facade();
        light.serve_Hall_Light();
    }
}
