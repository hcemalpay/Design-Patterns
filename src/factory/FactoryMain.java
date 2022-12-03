package factory;

/**
 * @author hcalpay
 */
public class FactoryMain {

    public static void main(String[] args) {
        try {
            Apple iphone = (Apple) TelefonFactory.createTelefon(Apple.class);
            iphone.uretimYılı(2020);
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}

