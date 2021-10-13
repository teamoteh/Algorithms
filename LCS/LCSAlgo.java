package LCS;

import java.util.Arrays;

public class LCSAlgo {
    public int LCS(char [] x, char [] y, int n, int m){
        int[][] arrayProb = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                //if first character of x and y are similar
               
                if(i == 0 || j == 0 ){
                    arrayProb[i][j] = 0;
                    continue;
                }

                if(x[i-1] == y[j-1]){
                    arrayProb[i][j] = arrayProb[i-1][j-1] + 1;
                    for (int[] row : arrayProb)
                        System.out.println(Arrays.toString(row));
                    continue;
                }
                //if left LCS length greater than top LCS length
                if(arrayProb[i-1][j] >= arrayProb[i][j-1]){
                    arrayProb[i][j] = arrayProb[i-1][j];
                    for (int[] row : arrayProb)
                        System.out.println(Arrays.toString(row));
                    continue;
                }
                else{
                    arrayProb[i][j] = arrayProb[i][j-1];
                    for (int[] row : arrayProb)
                        System.out.println(Arrays.toString(row));
                    continue;
                }
            }
        }
        //commit
        return arrayProb[n][m];

    }

}
