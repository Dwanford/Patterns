package AbstractFactory;

public class Fridge {
    private Juice juice;
    private Jam jam;

    public Fridge(ProductsFactory factory) {
        juice = factory.createJuice();
        jam = factory.createJam();
    }

    public void consume() {
        juice.drink();
        jam.eat();
    }
}
