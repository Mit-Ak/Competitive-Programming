/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int[][] mat=new int[6][6];
        int rt=0,ct=0;
        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                mat[i][j]=sc.nextInt();
            if(mat[i][j]==1){
                  rt=3-i;
                  ct=3-j;
            }
        }
        }
        System.out.println(Math.abs((int)rt)+Math.abs((int)ct));
    }
}
