package abstractFactory.factory;

import abstractFactory.Far;
import abstractFactory.Tekerlek;
import abstractFactory.audi.AudiFar;
import abstractFactory.audi.AudiTekerlek;

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
