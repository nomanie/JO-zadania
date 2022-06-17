/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadania2;

/**
 *
 * @author piotr
 */
public class SquareSequence {
     private int a;
     private int b;
     private int c;
    
    public void setData(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public float calculateForX(float x)
    {

        return ((a * (x*x)) + (b*x) + c);
    }
    
    public int getElementsCount()
    {
        float d = (this.b*this.b) - (4*this.a*this.c);
        if(d < 0){
            return 0;
        } else if(d == 0){
            return 1;
        } else{
            return 2;
        }
    }
    
    public static void main()
    {
        SquareSequence x = new SquareSequence();
        x.setData(2, 4, 6);
        System.out.println(x.calculateForX(2));
        System.out.println(x.getElementsCount());
    }
}
