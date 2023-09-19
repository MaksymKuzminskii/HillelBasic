package gmail.kymaxgen.task20;

public class MusicStyles {
    protected void playMusic() {
        System.out.println("Music plays, people dance...");
    }
}

class PopMusic extends MusicStyles {
    @Override
    protected void playMusic() {
        System.out.println("Now we are listening to pop... boring");
    }
}

class RockMusic extends MusicStyles {
    @Override
    protected void playMusic() {
        System.out.println("Rock is playing");
    }
}
class ClassicMusic extends MusicStyles {
    @Override
    protected void playMusic() {
        System.out.println("Something in classic style is playing...");
    }
}



