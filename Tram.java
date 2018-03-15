
package tram;

import java.util.Scanner;
public class Tram {
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int x=0,min=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            x+=b[i]-a[i];
            min=Math.max(x, min);
        }
        System.out.println(min);
    }
}
