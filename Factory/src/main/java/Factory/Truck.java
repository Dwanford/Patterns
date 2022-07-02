package Factory;

public class Truck implements Transport{
    @Override
    public void sendPackage() {
        System.out.println("Sending Truck with package...");
    }
}
