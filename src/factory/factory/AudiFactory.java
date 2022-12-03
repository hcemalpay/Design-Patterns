package factory.factory;

import factory.Far;
import factory.Tekerlek;
import factory.audi.AudiFar;
import factory.audi.AudiTekerlek;

/**
 * @author hcalpay
 */
public class AudiFactory extends Factory {

    @Override
    public Tekerlek tekerlekUret() {
        return new AudiTekerlek();
    }

    @Override
    public Far farUret() {
        return new AudiFar();
    }
}
