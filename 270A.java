package pkg270a;

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
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
                 if(k<=180)
                System.out.println(360%(180-k)==0?"YES":"NO");
                 else
                     System.out.println("NO");
        }
    }
}
