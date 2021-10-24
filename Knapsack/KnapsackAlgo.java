package Knapsack;

public class KnapsackAlgo{
    int [][] profit;

    public void setProfitMatrix(int capacity, int number){
        this.profit = new int[capacity+1][number + 1];
    }
    public int knapsack(int [] weight, int [] profit, int capacity, int num){
        for(int i = 0; i < capacity + 1; i ++){
            this.profit[i][0] = 0;
        }
        for(int j = 0; j < num + 1; j++){
            this.profit[0][j] = 0;
        }

        for(int i=1; i < capacity + 1; i++){
            for(int j = 1; j < num + 1; j++){
                this.profit[i][j] = this.profit[i][j - 1];
                if(weight[j-1] <= i){
                    if(this.profit[i][j] < this.profit[i - weight[j-1]][j - 1] + profit[j-1]){
                        this.profit[i][j] = this.profit[i - weight[j-1]][j - 1] + profit[j-1];
                    }
                }
            }
        }

        return this.profit[capacity][num];
    }
    
}