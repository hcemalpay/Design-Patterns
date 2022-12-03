package factory.factory;

import factory.Far;
import factory.Tekerlek;
import factory.mercedes.MercedesFar;
import factory.mercedes.MercedesTekerlek;

/**
 * @author hcalpay
 */
public class MercedesFactory extends Factory {

    @Override
    public Tekerlek tekerlekUret() {
        return new MercedesTekerlek();
    }

    @Override
    public Far farUret() {
        return new MercedesFar();
    }
}
