package facades;

import java.util.Scanner;

public class Main_Facade {
    Scanner scanner = new Scanner(System.in);
    Music_Facade music_facade = new Music_Facade();
    Light_Facade  light_facade = new Light_Facade();

    private void light_serve(){
        System.out.println("Please choose the room where you exist:");
        System.out.println("1. Hall\n2. Kitchen\n3. Bedroom\n4. Bathroom");
        int room = scanner.nextInt();
        switch (room){
            case 1 -> light_facade.serve_Hall_Light();
            case 2 -> light_facade.serve_Kitchen_Light();
            case 3 -> light_facade.serve_Bedroom_Light();
            case 4 -> light_facade.serve_Bathroom_Light();
            default -> System.out.println("Invalid choice");
        }
    }

    private void music_serve(){
        System.out.println("Please choose the room where you exist:");
        System.out.println("1. Inside\n2. Outside");
        int area = scanner.nextInt();
        switch (area){
            case 1 -> music_facade.serve_Inside_Music();
            case 2 -> music_facade.serve_Outside_Music();
            default -> System.out.println("Invalid choice");
        }
    }


    public void serveApp(){
        while (true){
            System.out.println("------Welcome to smart house app!!!------\nPlease choose the option:");
            System.out.println("1. Light\n2. Music\n3. Security\n4. Thermostat\n0. Exit");
            int choise = scanner.nextInt();
            switch (choise){
                case 1 -> light_serve();
                case 2 -> music_serve();
            }
            if (choise == 0){
                System.out.println("------Thanks to use my app------");
                break;
            }
        }
    }
}
