/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watering;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Watering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] p=new int[12];
        for(int i=0;i<12;i++)
            p[i]=sc.nextInt();
        Arrays.sort(p);
        int val=0,count=0;
        for(int i=11;i>=0;i--){
            if(val<k)
            {
                val+=p[i];
                count++;
            }
            else
            {
               break;
            }
        }
        if(val<k)
            count=-1;
        System.out.println(count);
    }
}
