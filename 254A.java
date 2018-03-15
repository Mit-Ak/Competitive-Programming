/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg254a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Akarsh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
         public static void solution(BufferedReader reader, PrintWriter out)
            throws IOException {
        In in = new In(reader);
        int n = in.nextInt();
        int[] pre = new int[5001];
        int[][] res = new int[n][2];
        int j = 0;
        for (int i = 1; i <= n + n; i++) {
            int a = in.nextInt();
            if (pre[a] == 0)
                pre[a] = i;
            else {
                res[j][0] = i;
                res[j][1] = pre[a];
                pre[a] = 0;
                j++;
            }
        }
        if (j < n)
            out.println(-1);
        else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++)
                sb.append(String.format("%d %d\n", res[i][0], res[i][1]));
            out.print(sb.toString());
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
                "output.txt")));
        solution(reader, out);
        out.close();
    }

    protected static class In {
        private BufferedReader reader;
        private StringTokenizer tokenizer = new StringTokenizer("");

        public In(BufferedReader reader) {
            this.reader = reader;
        }

        public String next() throws IOException {
            while (!tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
