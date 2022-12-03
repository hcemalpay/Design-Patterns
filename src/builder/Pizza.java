package builder;

public class Pizza {

    private final int size;
    private final String name;
    private final boolean cheese;
    private final boolean olive;
    private final boolean pepperoni;
    private final boolean bacon;
    private final boolean mushroom;
    private final boolean mozarella;

    Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.name = pizzaBuilder.name;
        this.cheese = pizzaBuilder.cheese;
        this.olive = pizzaBuilder.olive;
        this.pepperoni = pizzaBuilder.pepperoni;
        this.bacon = pizzaBuilder.bacon;
        this.mushroom = pizzaBuilder.mushroom;
        this.mozarella = pizzaBuilder.mozarella;
    }

    @Override
    public String toString() {
        return "builder.Pizza{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", cheese=" + cheese +
                ", olive=" + olive +
                ", pepperoni=" + pepperoni +
                ", bacon=" + bacon +
                ", mushroom=" + mushroom +
                ", mozarella=" + mozarella +
                '}';
    }
}