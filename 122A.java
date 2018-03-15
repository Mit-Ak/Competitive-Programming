/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg122a;

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
        int n=sc.nextInt();
        String a=n+"";
        if(a.contains("1")||a.contains("0")||a.contains("2")||a.contains("3")||a.contains("5")||a.contains("6")||a.contains("8")||a.contains("9")){
            if(n%4==0||n%7==0||n%47==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
            System.out.println("YES");
    }
    
}
