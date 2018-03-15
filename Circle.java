/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int cr=sc.nextInt();
            double v=Math.sqrt((double)(Math.pow(x, 2)+Math.pow(y, 2)));
            if(v+cr<=r && v>=cr+r-d)
                    count++;
        }
        System.out.println(count);
    }
}
