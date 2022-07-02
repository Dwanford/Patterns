package AbstractFactory;

public class Program {

    public static void main(String[] args) {
        Fridge fridge = new Fridge(new GrapeProductsFactory());
        fridge.consume();
    }
}
