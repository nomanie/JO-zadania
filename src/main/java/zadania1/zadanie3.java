/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadania1;
import javax.swing.JOptionPane;
import java.util.*;
import java.math.BigInteger;
/**
 *
 * @author piotr
 */
public class zadanie3 {
   
    public static void main() {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe, do ktorej program ma zsumowac liczby nieparzyste");
        int koniecPrzedzialu = scanner.nextInt();
        BigInteger wynik = new BigInteger("0");
        for(int i = 0; i <= koniecPrzedzialu; i++){
            if(i % 2 != 0)
            {
                wynik = wynik.add(BigInteger.valueOf(i));
            }
        }
        JOptionPane.showMessageDialog(null, wynik);
    }
}
