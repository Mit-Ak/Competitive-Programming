/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg102b;

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
        String s=sc.next();
        long sum=0,count=0;
        while(s.length()>1){
            sum=0;
            for(int i=0;i<s.length();i++){
                sum+=s.charAt(i)-'0';
            }
           s=sum+"";
           count++;
       }
        System.out.println(count);
}
}
