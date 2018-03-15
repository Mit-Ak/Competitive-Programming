/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalisation;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Capitalisation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int pos=0;
    StringBuilder sb=new StringBuilder();
    sb.append(Character.toUpperCase(s.charAt(0)));
    for(int i=1;i<s.length();i++){
        if(s.charAt(i)==' ' && s.charAt(i)!='\n')
        {
         sb.append(s.charAt(i)).append(Character.toUpperCase(s.charAt(i+1)));
         i++;
    }
        else
            sb.append(s.charAt(i));
    }
    System.out.println(sb.toString());
    }
}
