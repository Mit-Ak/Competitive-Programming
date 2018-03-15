package pkg300a;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n-1];
        int count=0,p=0;
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(k!=0){
                a[p]=k;
              p++;
            }
            if(k<0)
                count++;
        }
        Arrays.sort(a);
        System.out.println("1"+" "+a[0]); 
        if(count%2==0)
        {
            System.out.print(n-3+" ");
            for(int i=2;i<p;i++)
                System.out.print(a[i]+" ");
            System.out.println();
            System.out.println(1+" "+0+" "+a[1]);
        }
        else{
            System.out.print(n-2+" ");
            for(int i=1;i<p;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            System.out.println(1+" "+0);
        }
    }
}
