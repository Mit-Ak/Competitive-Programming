/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg353a;

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
        int[] a=new int[n];
        int[] b=new int[n];
        long sum=0,sum1=0,count=0,count1=0;
        boolean has01=false;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            sum+=a[i];
            sum1+=b[i];
            if(a[i]%2!=0)
                count++;
            if(b[i]%2!=0)
                count1++;
            if(a[i]%2==0 && b[i]%2!=0 || (a[i]%2!=0 && b[i]%2==0))
                  has01=true;
        }
        if(sum%2==0 && sum1%2==0){
            System.out.println("0");
            return;
        }
        if(count%2!=0 && count1%2!=0 && has01){
                 System.out.println("1");
    
        }
      else
            System.out.println("-1");
    }
}
