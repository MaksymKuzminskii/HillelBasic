package gmail.kymaxgen.task16;

public class Androids implements Smartphones, LinuxOS {

    @Override
    public void intro() {
        System.out.println("Vuala, here is intro of Linux");
    }

    @Override
    public void call() {
        System.out.println("Android is calling to somebody");
    }

    @Override
    public void sms() {
        System.out.println("Android has sent SMS");
    }

    @Override
    public void internet() {
        System.out.println("Internet has been activated on Android");
    }
}
