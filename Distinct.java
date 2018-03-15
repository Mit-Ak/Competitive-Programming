/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distinct;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Distinct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] count=new int[1001];
        for(int i=1;i<=n;i++){
             count[sc.nextInt()]++;
    }
        int max=0;
    for(int i=1;i<=1000;i++){
        max=Math.max(max, count[i]);
    }
    
        for(int i=1;i<=n;i++){
            
        }
    }
}
