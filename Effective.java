    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
package effective;
import java.util.ArrayList;
import java.util.Scanner;
    /**
    *
    * @author Akarsh
    */
public class Effective {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        ArrayList al=new ArrayList();
        long x=0,y=0;
         int[] b=new int[n+1];
         int[] c=new int[n+1];
         for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
            b[a[i]]=i; 
         }
         int m=sc.nextInt();
         for(int i=1;i<=m;i++){
             c[i]=sc.nextInt();
            x+=b[c[i]];
            y+=n-b[c[i]]+1;
         }
        System.out.println(x+" "+y);
    } 
}
