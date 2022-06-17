/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadania2;
import zadania2.WielomianI;

/**
 *
 * @author piotr
 */
public class zadanie3 
{
    public static void main()
    {
        WielomianI w[] = new WielomianI[3];
        w[0] = new FunkcjaLiniowa(2, 1); // 2x + 1
        w[1] = new FunkcjaKwadratowa(1, -2, 2); // x*x - 2x + 2
        w[2] = new FunkcjaKwadratowa(1, 0, -1); // x*x - 1
        for (int i=0; i<3; i++) {
            w[i].wypiszMiejscaZerowe();
        }
    }
}
