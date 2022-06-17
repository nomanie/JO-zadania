package zadania5;

import java.util.*;
//Tu wstaw zmodyfikowaną klasę przechowującą współrzędne punktu
class Wspolrzedna{
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
    public int hashCode() {
        return Objects.hash(x);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Wspolrzedna other = (Wspolrzedna) obj;
        if (this.x != other.x) {
            return false;
        }
        return this.y == other.y;
    }

}
public class zadanie2 
{
    public static void main() 
    {
        HashMap mapa = new HashMap();
        mapa.put(new Wspolrzedna(2, 3), new String("czerwony"));
        mapa.put(new Wspolrzedna(-3, 0), new String("czarny"));
        mapa.put(new Wspolrzedna(-1, 2), new String("czerwony"));
        mapa.put(new Wspolrzedna(2, -1), new String("czarny"));
        Wspolrzedna w = new Wspolrzedna(-1, 2);
        System.out.println(w);
        System.out.println("Punkt " + w.toString()
        + " ma kolor " + mapa.get(w));
    }
}
