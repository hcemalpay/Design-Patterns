package composite;

import jdk.jshell.spi.ExecutionControl;

import java.io.Console;

/**
 * @author hcalpay
 */
public class PrimitiveSoldier extends Soldier{

    public PrimitiveSoldier(String name,Rank rank)
    {
        super(name,rank);
    }

    // Bu fonksiyonun Leaf için anlamı yoktur.
    public void AddSoldier(Soldier soldier)
    {
        try {
            throw new ExecutionControl.NotImplementedException("Hata");
        } catch (ExecutionControl.NotImplementedException e) {
            e.printStackTrace();
        }
    }

    // Bu fonksiyonun Leaf için anlamı yoktur.
    public void RemoveSoldier(Soldier soldier)
    {
        try {
            throw new ExecutionControl.NotImplementedException("Hata");
        } catch (ExecutionControl.NotImplementedException e) {
            e.printStackTrace();
        }
    }

    public void ExecuteOrder()
    {
        System.out.println(rank +name);
    }

}
