/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Net {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i)))
                x++;
            if(Character.isLowerCase(s.charAt(i)))
                y++;
        }
        if(x>y)
            System.out.println(s.toUpperCase());
        else
            System.out.println(s.toLowerCase());
    }
    
}
