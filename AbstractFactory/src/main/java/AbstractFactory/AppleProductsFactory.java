package AbstractFactory;

public class AppleProductsFactory implements ProductsFactory {
    @Override
    public Juice createJuice() {
        return new AppleJuice();
    }

    @Override
    public Jam createJam() {
        return new AppleJam();
    }
}
