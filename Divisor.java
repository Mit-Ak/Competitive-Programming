/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisor;
import java.util.Scanner;
/**
 *
 * @author Akarsh
 */
public class Divisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int[] count=new int[8];
        int n=sc.nextInt();
        boolean solution;
        for(int i=1;i<=n;i++)
            count[sc.nextInt()]++;
        if(count[5]==0 && count[7]==0 && count[2]>=count[4] && count[1]==count[4]+count[6] && count[2]+count[3]==count[4]+count[6]){
            for(int i=0;i<count[4];i++)
            {
            System.out.println("1 2 4");
            }
            count[2]-=count[4];
             for(int i=0;i<count[2];i++)
             {
             System.out.println("1 2 6");
             }
                 for(int i=0;i<count[3];i++)
                 {
             System.out.println("1 3 6");
                 }
        }
        else
        {
             System.out.printf("-1\n");
        }
    }
}
