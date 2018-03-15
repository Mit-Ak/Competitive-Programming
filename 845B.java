/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg845b;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int y=6;
        int[] arr=new int[6];
      for(int i=0;i<6;i++){
          arr[i]=s.charAt(i)-'0';
        }
      for(int a=0;a<=99999;a++){
      s=String.format("%06d",a);
        int[] good=new int[6];
       for(int i=0;i<6;i++)
       {
           good[i]=s.charAt(i)-'0';
       }
       if((good[0]+good[1]+good[2])!=(good[3]+good[4]+good[5]))
           continue;
       int x=0;
       for(int j=0;j<6;j++){
           if(arr[j]!=good[j])
               x++;
       }
       y=Math.min(y,x);
        }
     System.out.println(y);
    }
}
