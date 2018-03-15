/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
         String a=sc.next();
         String b=sc.next();
         int swap=0;
         if(a.length()!=b.length())
         {
            System.out.println("NO");
             return;
         }
         HashSet<Character> hs1=new HashSet<>();
         HashSet<Character> hs2=new HashSet<>();
         for(int i=0;i<a.length();i++){
             if(a.charAt(i)!=b.charAt(i)){
                     swap++;
                  hs1.add(a.charAt(i));
                  hs2.add(b.charAt(i));
                 }
         }
         System.out.println(swap==2 && hs1.equals(hs2)?"YES":"NO");
    }
}
