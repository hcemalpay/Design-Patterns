package builder;

public class Pizza {

    private final int size;
    private final String name;
    private boolean cheese;
    private boolean olive;
    private boolean pepperoni;
    private boolean bacon;
    private boolean mushroom;
    private boolean mozarella;

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