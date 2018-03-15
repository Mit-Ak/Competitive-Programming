/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg296a;
import java.util.Arrays;
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
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=1,count=0;
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
            for (int i = 1; i < n; ++i)
    {
        if (arr[i] == arr[i-1])
        {
            count += 1;
            if (count > max)
            {
                max = count;
            }
        }
        else
        {
            count= 1;
        }
    }
            System.out.println(count<=(n+1)/2?"YES":"NO");
    }
}
