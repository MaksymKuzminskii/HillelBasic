package gmail.kymaxgen.task20;

public class MusicRunner {
    public static void main(String[] args) {
        String popBand = "Serduchka";
        String rockBand = "AC/DC";
        String classicBand = "Bah";

        MusicStyles[] musicStyles = {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };

        for (MusicStyles style : musicStyles) {
            style.playMusic();
        }
    }
}
