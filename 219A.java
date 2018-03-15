/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg219a;

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
        int k=sc.nextInt();
        String s=sc.next();
        String p="",d="";
        char[] count=new char[26];
        for(int i=0;i<s.length();i++){
           count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=k && count[i]!=0){
                System.out.println(-1);
               return;
            }
            if(count[i]==k){
             char c=(char)(i+97);
             p+=c+"";
            }
        }
        for(int i=0;i<k;i++)
            d+=p;
        System.out.println(d);
    }
}
