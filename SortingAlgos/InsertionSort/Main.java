package SortingAlgos.InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String args[]){
        Random r = new Random();

        int [] randArray = new int[r.nextInt(100)];
        for(int i = 0; i < randArray.length; i++){
            randArray[i] = r.nextInt(100);
            System.out.printf("%d,", randArray[i]);
        }
        System.out.println("");
        System.out.println("");
        InsertSort algo = new InsertSort();
        algo.InsertionSort(randArray, randArray.length);

        System.out.println("");

        System.out.println("The new sorted array is:");

        System.out.println("");

        for(int i = 0; i < randArray.length; i++){
            
            System.out.printf("%d,", randArray[i]);
        }
    }
}
