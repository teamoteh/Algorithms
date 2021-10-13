package SortingAlgos.InsertionSort;

public class InsertSort{
    public void InsertionSort(int [] x, int n){
        long start = System.nanoTime();
 
        for(int i=0; i < n; i++){
            int key = x[i];
            int j = i - 1;
            while(j >= 0 && x[j] > key){
                x[j + 1] = x [j];
                j -= 1;
            }
            x[j + 1] = key;
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println("The elapsed time taken for an array of " + n +" length is: " + elapsedTime +"ns");

    }
}