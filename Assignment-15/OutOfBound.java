import java.util.Scanner;

class OutOfBound {
    public static void main(String ar[]) {
        try {
            int[] arr;
            int n, i;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            n = s.nextInt();
            arr = new int[n];
            System.out.println("Enter the elements:");
            for (i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println("Enter the index more than the size:");
            int index = s.nextInt();
            System.out.println("Elements at index " + index + " = " + arr[index - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundException!"+ e);
        }
    }
}
