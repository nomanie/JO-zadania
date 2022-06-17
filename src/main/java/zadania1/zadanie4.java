/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadania1;

import java.math.BigInteger;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author piotr
 */
public class zadanie4 {
    static char hexaChars[] = {'A','B','C','D','E','F'};
    static void converter(int number, int system)
    {
        if(system < 2){
           System.exit(1);
        }
        char[] binaryNum = new char[32];
 
        int i = 0;
        while (number > 0) {
            binaryNum[i] = number % system < 10 ? (char)((number % system)+48) : zadanie4.hexaChars[(number % system) - 10];
            number = number / system;
            i++;
        }
 
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    
     public static void main() {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe, ktora chcesz zamienic");
        int number = scanner.nextInt();
        System.out.println("Podaj system, na ktory ma zostac zamieniona liczba");
        int system = scanner.nextInt();
        converter(number, system);
    }
}
