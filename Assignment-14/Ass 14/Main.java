import java.util.Scanner;

import mathop.MathOperation;
import statop.StatsOperation;

public class Main {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

       System.out.println("max in the array   "+MathOperation.findMax(arr)); 
       System.out.println("min in the array   "+MathOperation.findMin(arr));

       StatsOperation obj = new StatsOperation();
       float avg =obj.findAverage(arr);
       int median = obj.findMedian(arr);
       System.out.println("average =   "+avg );
       System.out.println("Median = "+median);


    }
    
}
