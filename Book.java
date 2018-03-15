/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] day=new int[8];
        for(int i=1;i<=7;i++){
            day[i]=sc.nextInt();
        }
        int val=0,pos=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=7;j++){
                if((val+day[j])<n){
                    val+=day[j];
                    System.out.println(val);
                }
                else{
                  pos=j;  
                  break;
                }
            }
        }
         System.out.println(pos);
    }
}
