/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package zadania.zadania;
import zadania1.*;
import zadania2.*;
import zadania3.*;
import zadania5.*;
import java.util.Scanner;
/**
 *
 * @author piotr
 */
public class Zadania {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz grupe zadan: \n 1: 1.1\n2: 1.2\n3: 1.3\n4: 1.4\n5: 2.1\n6: 2.2\n7:2.3\n8: 3.1\n9: 3.2\n:10: 5.1\n11: 5.2");
        int wybor = scanner.nextInt();
        switch(wybor) {
            case 1:
                zadania1.zadanie1.main();
                break;
            case 2:
                zadania1.zadanie2.main();
                break;
            case 3:
                zadania1.zadanie3.main();
                break;
            case 4:
                zadania1.zadanie4.main();
                break;
            case 5:
                zadania2.Rational.main();
                break;
            case 6:
                zadania2.SquareSequence.main();
                break;
            case 7:
                zadania2.zadanie3.main();
                break;
            case 8:
                zadania3.zadanie1.main();
                break;
            case 9:
                zadania3.zadanie2.main();
                break;
            case 10: 
                zadania5.zadanie1.main();
                break;
            case 11: 
                zadania5.zadanie2.main();
                break;
            default:
                System.out.println("Nie znaleziono zadania!");
        }
        
    }
}
