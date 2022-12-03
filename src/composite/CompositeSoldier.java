package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcalpay
 * @Date 3.12.2022
 */
public class CompositeSoldier extends Soldier {

    // Composite tip kendi içerisinde birden fazla Component tipi içerebilir. Bu tipleri bir koleksiyon içerisinde tutabilir.
    private List<Soldier> soldiers = new ArrayList<Soldier>();

    public CompositeSoldier(String name, Rank rank) {
        super(name, rank);
    }

    // Composite tipin altına bir Component eklemek için kullanılır
    public void AddSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    // Composite tipin altındaki koleksiyon içerisinden bir Component tipinin çıkartmak için kullanılır
    public void RemoveSoldier(Soldier soldier) {
        soldiers.remove(soldier);
    }

    // Önemli nokta. Composite tip içerisindeki bu operasyon, Composite tipe bağlı tüm Component'ler için gerçekleştirilir.
    public void ExecuteOrder() {
        System.out.println(name + rank);
        soldiers.stream().forEach(Soldier::ExecuteOrder);
    }
}
