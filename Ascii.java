/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Ascii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.contains("H")||s.contains("Q")||s.contains("9"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
