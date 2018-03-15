/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package child;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Child {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int val=0;
        HashMap ad=new HashMap();
        for(int i=0;i<n;i++){
            ad.put(sc.nextInt(),i+1);
        }
     Iterator iterator= ad.keySet().iterator();
     while(iterator.hasNext()){
         int key=(int)iterator.next();
         if((int)ad.get(key)<=m){
             ad.remove(key);
         }
             else
             {
              ad.put((int)ad.get(key)-m,key);
                     }
     }
     System.out.println(ad);
    }
    
}
