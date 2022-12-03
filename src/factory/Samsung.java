package factory;

/**
 * @author hcalpay
 */
public class Samsung implements Telefon {
    @Override
    public void telefonMarkasi() {
        System.out.println("Telefon Markası Samsung");
    }

    @Override
    public void uretimYılı(int yil) {
        System.out.println(yil + " yılında üretilmiştir.");
    }

    @Override
    public void uretimYeri(String ulke) {
        System.out.println(ulke + " ulkesinde üretilmiştir.");
    }
}
