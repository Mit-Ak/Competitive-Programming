/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elephant;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Elephant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
     int c=s.indexOf("0");
     if(c==-1)
        System.out.println(s.substring(1));
     else
         System.out.println(s.substring(0, c)+s.substring(c+1));
    }
}
