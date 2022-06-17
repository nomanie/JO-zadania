/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadania2;

/**
 *
 * @author piotr
 */
interface WielomianI {
    public void wypiszMiejscaZerowe();
}

class FunkcjaLiniowa implements WielomianI
{
    public double a;
    public double b;
    
    public FunkcjaLiniowa(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    public void wypiszMiejscaZerowe()
    {
        b = -b; // przenosimy b na drugą stronę
        System.out.println(b / a);
    }
}

class FunkcjaKwadratowa implements WielomianI
{
    public double a;
    public double b;
    public double c;
    
    public FunkcjaKwadratowa(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void wypiszMiejscaZerowe()
    {
    double d = (this.b*this.b) - (4*this.a*this.c);
    if(d < 0){
        System.out.println("Brak miejsc zerowych");
    }
    else if(d == 0){
            System.out.println(-b / (2*a));
        } else{
        b = -b;
        double x1 = (b - Math.sqrt(d)) / (2 * a);
        double x2 = (b + Math.sqrt(d)) / (2 * a);
             System.out.println(x1 + " " + x2);
        }
    }
}