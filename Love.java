/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package love;

import java.util.Scanner;
public class Love {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=0,min=0;
        int x=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        min=a[0];
        for(int i=1;i<n;i++)
        {
            if(max<a[i] || min>a[i]){
                 System.out.println(a[i]);
                x++;
            }
            max=Math.max(max,a[i]);
            min=Math.min(min,a[i]);
        }
        System.out.println(x);
    } 
}
