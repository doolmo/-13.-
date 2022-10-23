package music;
public class MainApp {
    public static void main(String[] args) {
        PopMusic music = new PopMusic();
        music.playMusic();
        RockMusic music2 = new RockMusic();
        music2.playMusic();
        ClassicMusic music3 = new ClassicMusic();
        music3.playMusic();

    }
}