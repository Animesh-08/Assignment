package statop;

import java.util.Arrays;

public class StatsOperation {
    public float findAverage(int arr[])
    {
        int n = arr.length;
        float sum =0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];    
        }
        System.out.println(sum);
        return (sum/n);
    }

    public int findMedian(int arr[])
    {
        Arrays.sort(arr);
        int n = arr.length;
        if(n % 2==0)
        {
            return ((arr[n/2]+arr[(n/2)+1])/2);

        }
        else{
        return (arr[n/2]);
        }

    }

}