package factory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author hcalpay
 */
public class TelefonFactory {

    public TelefonFactory() {
    }

    public static Telefon createTelefon(Class aClass) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        return (Telefon) aClass.getDeclaredConstructor().newInstance();
    }
}
