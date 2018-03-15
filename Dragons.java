/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Dragons implements Comparable {

    /**
     * @param args the command line arguments
     */
    int x;
    int y;

    public Dragons(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        Dragons[] d;
        d=new Dragons[n];
        for(int i=0;i<n;i++){
            d[i]=new Dragons(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(d);
        for(int i=0;i<n;i++){
            if(s>=d[i].x)
                s+=d[i].y;
            else
            {
                System.out.println("NO");
                return;
            }
            
        }
        System.out.println("YES");
    }

    @Override
    public int compareTo(Object t) {
        Dragons p=(Dragons)t;
        if(this.x>p.x)
            return 1;
        else if(this.x<p.x)
            return -1;
        else return 0;
    }
}
