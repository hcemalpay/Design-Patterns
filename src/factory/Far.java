package factory;

/**
 * @author hcalpay
 */
public abstract class Far {
    private String far;

    protected Far(String far) {
        this.far = far;
    }

    public String getFar() {
        return far;
    }
}

