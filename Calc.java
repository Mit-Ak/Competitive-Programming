/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length();i++){
            sb.append(a.charAt(i)^b.charAt(i));
        }
       System.out.println(sb.toString());
    }
}
