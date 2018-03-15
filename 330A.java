/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg330a;

import java.util.HashSet;
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
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][] a=new char[r][c];
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();

        int z=0;
        for(int i=0;i<r;i++){
            String s=sc.next();
            for(int j=0;j<c;j++){
              a[i][j]=s.charAt(j);
              if(a[i][j]=='S'){
                  row.add(i);
                  col.add(j);
              }
        }
        }
        System.out.println(r*c-(row.size())*(col.size()));
    }
}