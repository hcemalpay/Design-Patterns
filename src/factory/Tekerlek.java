package factory;

/**
 * @author hcalpay
 */
public abstract class Tekerlek {
    private String tekerlekModeli;

    protected Tekerlek(String tekerlekModeli) {
        this.tekerlekModeli = tekerlekModeli;
    }

    public String getTekerlekModeli() {
        return tekerlekModeli;
    }
}

