/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mini=-1,CountM=1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int cur=sc.nextInt();
            if(cur<min){
                mini=i;
                min=cur;
                CountM=1;
            }
          else  if(cur==min)
                CountM++;
        }
        if(CountM>1){
            System.out.println("Still Rozdil");
        }
        else{
            System.out.println(mini+1);
        }
    }
}
