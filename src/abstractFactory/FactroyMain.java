package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.FactoryMaker;

/**
 * @author hcalpay
 */
public class FactroyMain {

    public static void main(String[] args) {
        Factory factory = FactoryMaker.getFactory("audi");
        System.out.println(factory.farUret().getFar());
        System.out.println(factory.tekerlekUret().getTekerlekModeli());
        Factory factory2 = FactoryMaker.getFactory("mercedes");
        System.out.println(factory2.farUret().getFar());
        System.out.println(factory2.tekerlekUret().getTekerlekModeli());
    }

}
