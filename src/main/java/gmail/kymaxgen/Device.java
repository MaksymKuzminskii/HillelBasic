package gmail.kymaxgen;

public class Device {
    public String imei = "1234";

    public Device() {
        System.out.println("Hello from contructor");
    }

    public Device(int number){
        System.out.println("Second constructor is working with num: " + number);
    }


    public static void main(String[] args) {
        Device device = new Device();
        System.out.println(device.imei);

    }

    public void showInfo() {
        System.out.println("My imei is: " + imei);
    }
}

class Phone extends Device{

    public Phone(){
        super();
    }
    String number;
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.showInfo();
        System.out.println("My phone is " + phone.number);
    }

}