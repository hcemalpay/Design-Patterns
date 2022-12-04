package abstractFactory.factory;

import abstractFactory.Far;
import abstractFactory.Tekerlek;
import abstractFactory.arabalar.mercedes.MercedesFar;
import abstractFactory.arabalar.mercedes.MercedesTekerlek;

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
