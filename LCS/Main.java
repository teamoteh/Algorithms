package LCS;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("Please input first string sequence of characters:");
        Scanner sc = new Scanner(System.in);
        char[] x = sc.next().toCharArray();
        System.out.println("Please input second string sequence of characters:");
        char[] y = sc.next().toCharArray();
        LCSAlgo lcs = new LCSAlgo();
        int result = lcs.LCS(x, y, x.length, y.length);

        System.out.println("The Longest Common Subsequence is: " + result);
        sc.close();
    }
}
