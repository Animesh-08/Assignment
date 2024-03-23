package mathop;
public class MathOperation{

    public static int findMax(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]> max)
            {
                max = arr[i];
            }
        }

        return max;
       

    }
    public static int findMin(int arr[])
    {
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
                             
        return min;

    }
}
