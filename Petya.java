/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petya;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Petya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String a=sc.next().toLowerCase();
        String b=sc.next().toLowerCase();
        int c=0;
        if(a.compareTo(b)>0)
            c=1;
        else if(a.compareTo(b)<0)
            c=-1;
        else
            c=0;
        System.out.println(c);
    }
    
}
