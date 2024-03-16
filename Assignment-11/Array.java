import java.util.Arrays;
import java.util.Scanner;

class TwoDArray {
    int[][] array;

    public TwoDArray(int n) {
        array = new int[2][n];
    }

    public void input() {
       
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] =sc.nextInt();
            }
        }
    }

    
    public void displayArray() {
        for (int i = 0; i < array.length; i++) {
            
            for(int j=0;j<array[0].length;j++)
            {
                System.out.print(array[i][j] +" ");

            }
            System.out.println();
        }
    }


    public void splitArray() {
        int midpoint = array[0].length / 2;
        int[] array1 = new int[midpoint];
        int[] array2 = new int[array[0].length - midpoint];

        for (int i = 0; i < midpoint; i++) {
            array1[i] = array[0][i];
        }
        for (int i = midpoint; i < array[0].length; i++) {
            array2[i - midpoint] = array[0][i];
        }

        OneDArray obj1 = new OneDArray(array1);
        OneDArray obj2 = new OneDArray(array2);

        System.out.println("Array 1: " + Arrays.toString(obj1.array));
        System.out.println("Array 2: " + Arrays.toString(obj2.array));
    }

    
    public static TwoDArray addArrays(TwoDArray obj1, TwoDArray obj2) {
        TwoDArray result = new TwoDArray(obj1.array[0].length);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < obj1.array[0].length; j++) {
                result.array[i][j] = obj1.array[i][j] + obj2.array[i][j];
            }
        }

        return result;
    }

    
    public static TwoDArray multiplyArrays(TwoDArray obj1, TwoDArray obj2) {
        TwoDArray result = new TwoDArray(obj1.array[0].length);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < obj1.array[0].length; j++) {
                result.array[i][j] = obj1.array[i][j] * obj2.array[i][j];
            }
        }

        return result;
    }
}

class OneDArray {
    int[] array;

   
    public OneDArray(int[] array) {
        this.array = array;
    }
}

public class Array {
    public static void main(String[] args) {
        TwoDArray obj = new TwoDArray(4);
        obj.input();
        System.out.println("Original Array:");
        obj.displayArray();
        System.out.println("Splitting Array:");
        obj.splitArray();

      
        TwoDArray obj1 = new TwoDArray(4);
        obj1.input();
        TwoDArray obj2 = new TwoDArray(4);
        obj2.input();
        TwoDArray sum = TwoDArray.addArrays(obj1, obj2);
        TwoDArray product = TwoDArray.multiplyArrays(obj1, obj2);
        System.out.println("Sum of Arrays:");
        sum.displayArray();
        System.out.println("Product of Arrays:");
        product.displayArray();
    }
}
