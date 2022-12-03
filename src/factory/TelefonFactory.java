package factory;

/**
 * @author hcalpay
 */
public class TelefonFactory {
    public TelefonFactory() {
    }

    public static Telefon createTelefon(Class aClass) throws IllegalAccessException, InstantiationException {
        return (Telefon) aClass.newInstance();
    }
}
