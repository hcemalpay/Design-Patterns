package prototype;

import java.util.Hashtable;

/**
 * @author hcalpay
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // Her Shape için veritabanı sorgusu çalıştığını varsay ve objeleri oluştur
    // shapeMap.put(shapeKey, shape);
    // Örneğin, 3 adet shape objesi oluşturduk

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
