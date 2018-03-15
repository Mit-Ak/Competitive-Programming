/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candies;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Candies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] ch=new int[n+1];
        int max=0,no=0;
        for(int i=1;i<=n;i++){
            ch[i]=sc.nextInt();
         max=Math.max(max,ch[i]);
        }
        for(int i=1;i<=n;i++){
            if(max==ch[i])
                no=i;
        }
        System.out.println(no);
    }
}
