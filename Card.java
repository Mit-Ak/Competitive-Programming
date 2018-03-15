package card;

import java.util.Arrays;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0,count=0;
        int [] card=new int[n];
        for(int i=0;i<n;i++){
            card[i]=sc.nextInt();
        }
          Arrays.sort(card);
        for(int i=n-1;i>=0;i--){
            p=card[i];
            if(p==0)
                continue;
            card[i]=0;
            for(int j=0;j<n;j++)
            {
                if(card[j]<p)
                    card[j]=0;
            }
            count++;
        }
        if(count%2!=0)
            System.out.println("Conan");
        else
         System.out.println("Agasa");

    }
}
