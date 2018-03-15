/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garden;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Garden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
          int n=sc.nextInt();
          int k=sc.nextInt();
          int[] arr=new int[n+1];
            for(int j=1;j<=k;j++){
                arr[sc.nextInt()]=1;
            }
            
        }
    }
    
}
