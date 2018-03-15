/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newyr;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class NewYr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        int i=0;
        for(i=n+1;i<=9012;i++){
            s=i+"";
            if((s.charAt(3)!=s.charAt(2)&& s.charAt(3)!=s.charAt(1) && s.charAt(3)!=s.charAt(0)) && (s.charAt(2)!=s.charAt(0)&& s.charAt(2)!=s.charAt(1) && s.charAt(2)!=s.charAt(3)) && (s.charAt(1)!=s.charAt(0)&& s.charAt(1)!=s.charAt(2) && s.charAt(1)!=s.charAt(3)) && (s.charAt(0)!=s.charAt(1) && s.charAt(0)!=s.charAt(2) && s.charAt(0)!=s.charAt(3)))
                break;
        }
        System.out.println(i);
    }
    
}
