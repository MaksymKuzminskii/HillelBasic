package gmail.kymaxgen.task16;

public class IPHones implements Smartphones, iOS{

    @Override
    public void intro() {
        System.out.println("Beep, here is intro of iOS");
    }

    @Override
    public void call() {
        System.out.println("iPhone is calling to somebody");
    }

    @Override
    public void sms() {
        System.out.println("iPhone has sent SMS");
    }

    @Override
    public void internet() {
        System.out.println("Internet has been activated on iPhone");
    }
}
