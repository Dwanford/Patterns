package Factory;

public class AirMail extends Mail{
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
