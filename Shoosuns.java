/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoosuns;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Shoosuns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int Count=0;
        ArrayList al=new ArrayList();
        for(int i=0;i<n;i++){
          int p=sc.nextInt();
          al.add(p);
          if(min>p){
              min=p;
              Count=1;
          }
          else if(min==p){
              Count++;
          }
          else if(Count==k)
              break;
          al.add(p);
        }
    }
}
