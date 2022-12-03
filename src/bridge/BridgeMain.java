package bridge;

import bridge.color.GreenColor;
import bridge.color.RedColor;

/**
 * @author hcalpay
 */
public class BridgeMain {

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
