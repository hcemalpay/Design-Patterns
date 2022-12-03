package abstractFactory;

/**
 * @author hcalpay
 */
public abstract class Tekerlek {
    private final String tekerlekModeli;

    protected Tekerlek(String tekerlekModeli) {
        this.tekerlekModeli = tekerlekModeli;
    }

    public String getTekerlekModeli() {
        return tekerlekModeli;
    }
}

