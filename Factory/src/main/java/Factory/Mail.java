package Factory;

public abstract class Mail {

    public void sendMail(String mail) {
        System.out.println("Registration "+ mail +" as a postal package...");
        Transport transport = createTransport();
        transport.sendPackage();
        System.out.println("Your postal track code: #############");
    }
    public abstract Transport createTransport();
}
