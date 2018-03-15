/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg285b;

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
        int s=sc.nextInt();
        int t=sc.nextInt();
        int[] p=new int[n+1];
        for(int i=1;i<=n;i++)
            p[i]=sc.nextInt();
        int ck=s;
         int ans=0;
        while(ck!=t && ans<=n+1)
        {
            ck=p[ck];
            ans++;
        }
        System.out.println(ans>n?-1:ans);
    }
}
