/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadania2;
/**
 *
 * @author piotr
 */
public class Rational {
    final private int licznik;
    final private int mianownik;
  
    public Rational(int n, int d) {
        this.licznik = n;
        this.mianownik = d;
    }

    public Rational add(Rational val) {
        int n = this.licznik * val.mianownik + val.licznik * this.mianownik;
        int d = this.mianownik * val.mianownik;

        return new Rational(n, d);
    }

    public Rational mul(Rational val) {
        int n = this.licznik * val.licznik;
        int d = this.mianownik * val.mianownik;

        return new Rational(n, d);
    }

    public Rational sub(Rational val) {
        int n = this.licznik * val.mianownik - val.licznik * this.mianownik;
        int d = this.mianownik * val.mianownik;

        return new Rational(n, d);
    }

    public Rational div(Rational val) {
        int n = this.licznik * val.mianownik;
        int d = this.mianownik * val.licznik;

        return new Rational(n, d);
    }

    @Override
    public String toString() {
        return licznik + "/" + mianownik;
    }

    public boolean equals(Rational r) {
        return (compareTo(r) == 0);
    }

    public int compareTo(Rational r) {
        int subtr = this.licznik * r.mianownik - this.mianownik * r.licznik;
        int sign = (this.mianownik * r.mianownik > 0 ? 1 : -1);

        if (subtr == 0) {
            return 0;
        }
        if (subtr * sign < 0) {
            return -1;
        }
        return 1;
    }
    
    public static void main()
    {
        Rational x = new Rational(2,4);
        Rational y = new Rational(3,6);
        System.out.println(x.add(y));
        System.out.println(x.sub(y));
        System.out.println(x.mul(y));
        System.out.println(x.div(y));
        System.out.println(x.equals(y));
        System.out.println(x.compareTo(y));
        System.out.println(x.toString());
    }

}
