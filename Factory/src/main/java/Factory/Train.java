package Factory;

public class Train implements Transport{
    @Override
    public void sendPackage() {
        System.out.println("Sending Train with package...");
    }
}
