package chess;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] arr=new char[n][m];
        for(int i=0;i<n;i++){
           arr[i]=sc.next().toCharArray();
      }
   for(int i=0;i<n;++i)
    {
        for(int j=0;j<m;++j)
        {
            if('.'==(arr[i][j]))
            {
                if((j+i)%2==0)
                    arr[i][j]='B';
                else 
                    arr[i][j]='W';
            }
        }
    }
    for(int i=0;i<n;++i){
     System.out.println(new String(arr[i]));
        }
    }
}