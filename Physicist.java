/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physicist;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Physicist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        int[] y=new int[n];
        int[] z=new int[n];
        int p=0,q=0,r=0;
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            z[i]=sc.nextInt();
            p+=x[i];
            q+=y[i];
            r+=z[i];
        }
        if(p==0 && q==0 && r==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
