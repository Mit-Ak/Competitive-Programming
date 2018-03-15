/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Forum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        ArrayList al=new ArrayList();
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            if(!al.contains(s.charAt(i)))
            al.add(s.charAt(i));
        }
        if(al.size()%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
