package abstractFactory.factory;

/**
 * @author hcalpay
 */
public class FactoryMaker {

    public static Factory getFactory(String factoryName) {
        if (factoryName.equals("audi")) {
            return new AudiFactory();
        } else {
            return new MercedesFactory();
        }
    }

}
