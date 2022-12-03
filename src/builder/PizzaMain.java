package builder;

/**
 * @author hcalpay
 */
public class PizzaMain {

    public static void main(String[] args) {
        PizzaBuilder myPizzaBuilder = new PizzaBuilder(15, "Italiano");
        myPizzaBuilder.withOptionalOlive(true);
        myPizzaBuilder.withOptionalMozarella(true);
        myPizzaBuilder.withOptionalMushroom(true);
        Pizza myFavoritePizza = myPizzaBuilder.buildPizza();
        System.out.println(myFavoritePizza.toString());
    }
}
