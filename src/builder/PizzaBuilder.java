package builder;

/**
 * @author hcalpay
 */
public class PizzaBuilder {

    protected final int size;
    protected final String name;
    protected boolean cheese;
    protected boolean olive;
    protected boolean pepperoni;
    protected boolean bacon;
    protected boolean mushroom;
    protected boolean mozarella;

    public PizzaBuilder(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public PizzaBuilder withOptionalCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder withOptionalOlive(boolean olive) {
        this.olive = olive;
        return this;
    }

    public PizzaBuilder withOptionalPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public PizzaBuilder withOptionalMushroom(boolean mushroom) {
        this.mushroom = mushroom;
        return this;
    }

    public PizzaBuilder withOptionalBacon(boolean bacon) {
        this.bacon = bacon;
        return this;
    }

    public PizzaBuilder withOptionalMozarella(boolean mozarella) {
        this.mozarella = mozarella;
        return this;
    }

    public Pizza buildPizza() {
        return new Pizza(this);
    }
}
