package AbstractFactory;

public class GrapeProductsFactory implements ProductsFactory {
    @Override
    public Juice createJuice() {
        return new GrapeJuice();
    }

    @Override
    public Jam createJam() {
        return new GrapeJam();
    }
}
