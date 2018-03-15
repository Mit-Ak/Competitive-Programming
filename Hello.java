/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         String p="hello";
         String output="NO";
         int a=0,b=0;
         while(s.length()>b){
             if(s.charAt(b++)==p.charAt(a)){
                 a++;
             }
              if(a>=p.length()){
               output="YES";
              break;
         }
         }
             System.out.println(output);
    }
}
