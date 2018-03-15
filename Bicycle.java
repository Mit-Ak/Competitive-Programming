/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Bicycle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0,Count=0,p=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int j=0;j<m;j++)
            b[j]=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(b[j]%a[i]==0){
               p=b[j]/a[i];
               if(p>max){
                   max=p;
                   Count=1;
               }
               else if(p==max)
                   Count++;
        }
            }
        }
        System.out.println(Count);
    }
}
