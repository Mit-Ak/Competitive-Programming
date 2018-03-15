package flowers;

import java.util.Arrays;
import java.util.Scanner;
public class Flowers {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        long p=0;
        for(int i=0;i<n;i++){
            if(arr[0]==arr[i])
                p++;
            else
                break;
        }
        long c=0;
         for(int i=n-1;i>=0;i--){
            if(arr[n-1]==arr[i])
                c++;
            else
                break;
        }
        System.out.print(arr[n-1]-arr[0]+" ");
                if(arr[n-1]-arr[0]==0){
                    System.out.println((long)n*(n-1)/2);
                }
              else
                    System.out.println(p*c);
    }
    
}
