/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Find {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
         s1=s1.replaceAll(" ", "");
         s2=s2.replaceAll(" ", "");
         for(int i=0;i<s2.length();i++){
             if(s1.contains(s2.charAt(i)+"")){
                 s1=s1.replaceFirst(s2.charAt(i)+"","");
             }
             else
             {
                 System.out.println("NO");
                 return;
             }
         }
         System.out.println("YES");
    }
}
