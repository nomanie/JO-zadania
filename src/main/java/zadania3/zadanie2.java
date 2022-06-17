package zadania3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
abstract class Wierzcholek {
    Wierzcholek lewy, prawy;
    public abstract int wartosc() throws DivideByZeroException;
}

class DivideByZeroException extends Exception
{
     public DivideByZeroException(String errorMessage)
     {
        super(errorMessage);
    }
}

class BadExpressionException extends Exception
{
     public BadExpressionException(String errorMessage)
     {
        super(errorMessage);
    }
}

class Stala extends Wierzcholek {
    final private int wart;
    
    public Stala(int x)
    {
        wart = x;
    }
    
    public int wartosc() 
    {
    return wart;
    }
    
}
    class Dzialanie extends Wierzcholek
    {
    private char op; // operator +, -, / lub *
    
    public Dzialanie(char znak)
    {
        op = znak;
    }
    
    public void dodajLewyArg(Wierzcholek arg)
    {
        lewy = arg;
    }
    
    public void dodajPrawyArg(Wierzcholek arg)
    {
        prawy = arg;
       
    }
    
    public int wartosc() throws DivideByZeroException
    {
        switch (op) 
        {
            case '+': return lewy.wartosc() + prawy.wartosc();
            case '-': return lewy.wartosc() - prawy.wartosc();
            case '/':
                if(prawy.wartosc() == 0){
                    throw new DivideByZeroException("Dzielenie przez 0!");
                }
                return lewy.wartosc() / prawy.wartosc();
            case '*': return lewy.wartosc() * prawy.wartosc();
        }   
        return 0;
    }
}

class Wyrazenie
{
    final private Wierzcholek korzen;
    
    private Wierzcholek utworzDrzewo(String w, int p, int q) throws BadExpressionException
    {
        if (p == q)
            return new Stala(Character.digit(w.charAt(p), 10));
        else {
            int i = p+1, nawiasy = 0;
            try{
                while ( (nawiasy != 0) || (w.charAt(i) == '(') ||
                (w.charAt(i) == ')') || (Character.isDigit(w.charAt(i))))
                {
                    if (w.charAt(i) == '(') ++nawiasy;
                    if (w.charAt(i) == ')') --nawiasy;
                    ++i;
                }
                Dzialanie nowy = new Dzialanie(w.charAt(i));
                nowy.dodajLewyArg(utworzDrzewo(w, p+1, i-1));
                nowy.dodajPrawyArg(utworzDrzewo(w, i+1, q-1));
                return nowy;
            } catch(BadExpressionException e){
                System.out.println(e);
            }
        }
        return null;
    }
    
    public Wyrazenie(String w) throws BadExpressionException
    {
        try{
            korzen = utworzDrzewo(w, 0, w.length()-1);
        } catch(BadExpressionException e) { 
            throw new BadExpressionException("Error2!");
        }
    }

    public int oblicz() throws DivideByZeroException, BadExpressionException
    {
        return korzen.wartosc();
    }

}
public class zadanie2 {

    public static void main()
    {
        try{
            Wyrazenie wyr = new Wyrazenie("(3*((1/0)-1))");
            System.out.println("" + wyr.oblicz());
        } catch(DivideByZeroException e) {
            System.out.println(e);
        } catch(BadExpressionException e){
             System.out.println(e);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}

