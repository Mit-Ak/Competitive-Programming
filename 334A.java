/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg334a;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int i=1,j=n*n;
         int count=n;
        while(i<=n*n && j>=1 && i<=j){
            System.out.println(i++ +" "+j--);
        }
    }
}
