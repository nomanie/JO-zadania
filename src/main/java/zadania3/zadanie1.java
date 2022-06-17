/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadania3;

/**
 *
 * @author piotr
 */
class PrzepelnienieException extends Exception
{
    public PrzepelnienieException(String errorMessage) {
        super(errorMessage);
    }
}

class NiedomiarException extends Exception
{
    public NiedomiarException(String errorMessage) {
        super(errorMessage);
    }
}

class Kolejka {
    
    static final int N = 5;
    private Object[] tab;
    private int pocz, zaost, lbel;
    
    public Kolejka() {pocz=0; zaost=0; lbel=0;
        tab = new Object[N];
    }
    
    void doKolejki(Object el) throws PrzepelnienieException {
        tab[zaost] = el;
        zaost = (zaost+1) % N;
        ++lbel;
        if(zaost > N){
            throw new PrzepelnienieException("Przepełniona kolejka!");
        }    
    }
    
    Object zKolejki() throws NiedomiarException {
        int ind = pocz;
        pocz = (pocz+1) % N;
        --lbel;
        if(ind > 0)
            return tab[ind];
        
        throw new NiedomiarException("Pusta kolejka!");    
    }
}
public class zadanie1 
{
    public static void main() 
    {
        Kolejka k = new Kolejka();
        try
        {
            k.doKolejki(new Integer(7));
            k.doKolejki(new String("Ala ma kota"));
            k.doKolejki(new Double(3.14));
            for (int i=1; i<=4; ++i)
                System.out.println((k.zKolejki()).toString());
            
        }
        catch (PrzepelnienieException e)
        {
            System.out.println(e);
        }
        catch (NiedomiarException e)
        {
            System.out.println(e);
        }
    }
}