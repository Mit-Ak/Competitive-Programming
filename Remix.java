/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remix;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Remix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.replace("WUB", " ");
         System.out.println(s.trim());
    }
    
}
