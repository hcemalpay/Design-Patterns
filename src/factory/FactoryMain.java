package factory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author hcalpay
 */
public class FactoryMain {

    public static void main(String[] args) {
        try {

            Apple iphone = (Apple) TelefonFactory.createTelefon(Apple.class);
            iphone.uretimYılı(2020);
            System.out.println("Telefon Tipinde Apple instance oluşturuldu");
            Samsung samsung= (Samsung) TelefonFactory.createTelefon(Samsung.class);
            samsung.uretimYılı(2021);
            System.out.println("Telefon Tipinde Samsung instance oluşturuldu");
        } catch (IllegalAccessException | InstantiationException |InvocationTargetException |NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

