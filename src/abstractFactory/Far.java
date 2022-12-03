package abstractFactory;

/**
 * @author hcalpay
 */
public abstract class Far {
    private final String far;

    protected Far(String far) {
        this.far = far;
    }

    public String getFar() {
        return far;
    }
}

