/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg304a;

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
        int ans=0;
        for(int i=3;i<n;i++){
            for(int j=i+1;j<=n;j++){
                double x= Math.sqrt((i*i+j*j));
                if(x==Math.floor(x) && x<=n)
                    ans++;
            }
        }
        System.out.println(ans);
    }
    
}
