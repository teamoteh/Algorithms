package LCS;

import java.util.Arrays;

public class LCSAlgo {
    public int LCS(char [] x, char [] y, int n, int m){
        int[][] arrayProb = new int[n][m];

        //intializing array to be 0 at the start
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arrayProb[i][j] = 0;
            }
        }

        for (int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                //if first character of x and y are similar
                if(x[i-1] == y[i-1]){
                    System.out.println(x[i]);
                    arrayProb[i][j] = arrayProb[i-1][j-1] + 1;
                }
                //if left LCS length greater than top LCS length
                if(arrayProb[i-1][j] >= arrayProb[i][j-1]){
                    arrayProb[i][j] = arrayProb[i-1][j];
                    System.out.println(Arrays.deepToString(arrayProb));
                }
                else{
                    arrayProb[i][j] = arrayProb[i][j-1];
                    System.out.println(Arrays.deepToString(arrayProb));
                }
            }
        }
        //commit
        return arrayProb[n][m];

    }

}
