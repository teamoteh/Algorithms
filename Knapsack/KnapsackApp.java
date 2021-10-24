package Knapsack;

import java.util.Scanner;

public class KnapsackApp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input how many objects there are: ");
        int number = sc.nextInt();
        int [] weight = new int[number];
        int [] prof = new int[number];
        
        for(int i = 0; i < number; i++){
            System.out.println("Please input the weight of Object " + (i + 1));
            weight[i] = sc.nextInt();
            System.out.println("Please input the profit of Object " + (i + 1));
            prof[i] = sc.nextInt();
        }

        System.out.println("Please input the capacity of the knapsack :");
        int cap = sc.nextInt();

        KnapsackAlgo knap = new KnapsackAlgo();
        knap.setProfitMatrix(cap, number);
        int maxProfit = knap.knapsack(weight, prof, cap, number);
        System.out.println("The Maximum profit of the knapsack is :" + maxProfit);
    }
}
