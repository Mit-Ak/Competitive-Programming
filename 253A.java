/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg253a;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class Main 
{
     public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(new File("input.txt"));
         try (PrintStream out = new PrintStream("output.txt")) {
             int n = in.nextInt(), m = in.nextInt();
             for (boolean girl = n < m; n > 0 && m > 0; girl = !girl)
                 if (girl) {
                     out.print('G');
                     m--;
                 } else {
                     out.print('B');
                     n--;
                 }      while (n-- > 0)
                     out.print('B');
                 while (m-- > 0)
                     out.print('G');
         }
  }
}