/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import java.util.Scanner;
/**
 *
 * @author 2603yokasmi
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //test
        Scanner input = new Scanner(System.in);                  
        System.out.println("Inserez x :");      
        int x = input.nextInt();
        System.out.println("Inserez y :");
        int y = input.nextInt();
        int resultat = x*y;
        System.out.println("résultat = " + resultat);
    }
    
}
