package composite;

/**
 * @author hcalpay
 */
public abstract class Soldier {

    protected String name;
    protected Rank rank;

    public Soldier(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public abstract void AddSoldier(Soldier soldier);

    public abstract void RemoveSoldier(Soldier soldier);

    public abstract void ExecuteOrder(); // Hem Leaf hemde Composite tipi için uygulanacak olan fonksiyon
}
