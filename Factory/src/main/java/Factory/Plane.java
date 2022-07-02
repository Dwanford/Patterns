package Factory;

public class Plane implements Transport{
    @Override
    public void sendPackage() {
        System.out.println("Sending plane with package...");
    }
}
