/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berlandish;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Berlandish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        StringBuilder sb=new StringBuilder(p);
        String c=sb.reverse().toString();
        String t=sc.next();
        System.out.println(c.compareTo(t)==0?"YES":"NO");
    }
}
