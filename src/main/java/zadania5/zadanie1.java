package zadania5;

/**@author piotr*/

import java.util.*;
//Tu wstaw zmodyfikowaną klasę przechowującą współrzędne punktu
class Wspolrzedna implements Comparable<Wspolrzedna> {
    private final int x;
    private final int y;
    
    public Wspolrzedna(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
    
    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    
    @Override
    public int compareTo(Wspolrzedna w)
    {
        int g = this.x == w.x ? 0 : this.x > w.x ? 1 : -1;
        if(g == 0){
            return this.y == w.y ? 0 : this.y > w.y ? 1 : -1;
        }
        return g;
    }
}
public class zadanie1 
{
    private static void wypiszElementy(TreeSet zbior) 
    {
        Iterator it = zbior.iterator();
        while (it.hasNext()) {
            System.out.println((it.next()).toString());
        }
    }
    
    public static void main() 
    {
        TreeSet zbior = new TreeSet();
        zbior.add( new Wspolrzedna(2, 3) );
        zbior.add( new Wspolrzedna(-3, 0) );
        zbior.add( new Wspolrzedna(-1, 2) );
        zbior.add( new Wspolrzedna(-1, 2) );
        zbior.add( new Wspolrzedna(-3, -2) );
        wypiszElementy(zbior);
    }
}
