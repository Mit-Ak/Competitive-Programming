/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg75a;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Integer a=sc.nextInt();
        Integer b=sc.nextInt();
        Integer c=a+b;
        String u=a+"";
        u=u.replace("0","");
        String v=b+"";
        v=v.replace("0","");
        String w=c+"";
        w=w.replace("0","");
        System.out.println((Integer.valueOf(u)+Integer.valueOf(v)==Integer.valueOf(w))?"YES":"NO");
    }
    
}
