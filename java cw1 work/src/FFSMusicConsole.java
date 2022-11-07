///introduction to the "app".
public class FFSMusicConsole {
    public static void main(String[] args)
    {
        System.out.println("======================");
        System.out.println("Welcome to FFS Music Player by Alexa Kralewska!");
        System.out.println("======================");

        MusicApp app = new MusicApp();
        app.doMainMenu();
    }
}
