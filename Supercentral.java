/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercentral;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Supercentral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int x=0,y=0,count=0;
        int right=0,left=0,up=0,down=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            x=a[i];
            y=b[i];
            right=0;left=0;up=0;down=0;
            for(int j=0;j<n;j++){
                if(((a[i]==a[j]) && (b[i]<b[j])))
                  right++;
            else if(((a[i]==a[j]) && (b[i]>b[j])))
                  left++;
            else if(((a[i]>a[j]) && (b[i]==b[j])))
                up++;
            else if((((a[i]<a[j]) && (b[i]==b[j]))))
                down++;
                }
        if(right>0 && left>0 && up>0 && down>0){
            if((up+down+left+right)>=4)
                count++;
        }
        }
        System.out.println(count);
    }
}
