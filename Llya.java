package llya;

import java.util.ArrayList;
import java.util.Scanner;

public class Llya {

    private static void plainDFS(Llya root, ArrayList<Llya> node) {
        root.visit=true;
        for(Llya nextNode: root.children){
            if(nextNode.visit) continue;
            nextNode.beauty=gcd(root.beauty,nextNode.value);
            plainDFS(nextNode,node);
        }
    }

    private static int gcd(int a, int b) {
      if(b==0)
          return a;
     return gcd(b,a%b);
    }

    private static void advDFS(Llya root, ArrayList<Llya> node, ArrayList<Integer> divisor,int[] divisorCount, int depth) {
        int v=root.value;       
        root.visit=true;
               for(int i=0;i<divisor.size();i++){
                   if(v%divisor.get(i)==0)
                       divisorCount[i]++;
               }
               int maxdivisor=0;
               for(int i=0;i<divisor.size();i++)
               {
                   if(divisorCount[divisor.size()-1-i]>=depth-1)
                   maxdivisor=divisor.get(divisor.size()-1-i);
                   break;
               }
             root.beauty=Math.max(maxdivisor,root.beauty);
             for(Llya nextNode:root.children){
                 if(nextNode.visit)continue;
                 advDFS(nextNode,node,divisor,divisorCount,depth+1);
             }
              for(int i=0;i<divisor.size();i++){
                   if(v%divisor.get(i)==0)
                       divisorCount[i]--;
               }
    }
    int value;
    int beauty;
    ArrayList<Llya> children;
    boolean visit;

    public Llya(int value) {
        this.value = value;
        this.children = new ArrayList<>();
        this.visit = false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=0,x=0,y=0;
        ArrayList<Llya> node=new ArrayList<>();
        for(int i=0;i<n;i++){
            v=sc.nextInt();
          Llya l=new Llya(v);
          node.add(l);
        }
        for(int i=0;i<n-1;i++){
           x=sc.nextInt()-1;
           y=sc.nextInt()-1;
           node.get(x).children.add(node.get(y));
           node.get(y).children.add(node.get(x));
        }
        Llya root=node.get(0);
        int N=root.value;
        root.beauty=0;
        plainDFS(root,node);
        
         ArrayList<Integer> divisor=new ArrayList<>();
        for(int i=1;i<=N;i++){
            if(N%i==0)
          divisor.add(i);
        }
        int[] divisorCount =new int[divisor.size()];
        for(Llya nodes:node){
            nodes.visit=false;
        }
        advDFS(root,node,divisor,divisorCount,1);
        for(int i=0;i<n;i++){
            System.out.print(node.get(i).beauty+" ");
        }
    }
}
