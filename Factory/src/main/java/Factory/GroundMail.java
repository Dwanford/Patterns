package Factory;

import java.util.Scanner;

public class GroundMail extends Mail{
    @Override
    public Transport createTransport() {
        System.out.println("Choose ground transport:\n(1) Truck\n(2) Train");
        int a = (new Scanner(System.in)).nextInt();
        if(a == 1) {
            return new Truck();
        } else if(a == 2) {
            return new Train();
        } else {
            throw new RuntimeException("Unknown ground transport.");
        }
    }
}
