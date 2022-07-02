package Factory;

public class Main {

    public static void main(String[] args) {
        Mail mail = new GroundMail();
        mail.sendMail("HELLO");
    }
}
