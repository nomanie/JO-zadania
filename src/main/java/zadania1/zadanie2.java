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
public class zadanie2 {
    
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe, ktorej silnie program ma obliczyc");
        int silnia = scanner.nextInt();
         BigInteger wynik = new BigInteger("1");
        
        for(int i = 1; i <= silnia; i++) {
            System.out.println(BigInteger.valueOf(i));
           wynik = wynik.multiply(BigInteger.valueOf(i));
        }
        
        JOptionPane.showMessageDialog(null, wynik);
        System.exit(1);
    }  
    
    
}
