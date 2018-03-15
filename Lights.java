/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lights;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Lights {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int[][] n=new int[5][5];
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++)
                n[i][j]=sc.nextInt();
        }
        for(int i=1;i<=3;i++){
           for(int j=1;j<=3;j++)
           {
          
              System.out.print((n[i][j]+n[i-1][j]+n[i][j-1]+n[i+1][j]+n[i][j+1])%2==0 ? 1:0);
                   }
           System.out.println();
        }
    }
}
