import java.util.Scanner;
class NullPointer
 {
    public static void main(String ar[]) 
{
        try {
            Scanner s = new Scanner(System.in);
            int n = Integer.parseInt(ar[0]);
            System.out.println(n);
            // String str = "ankit";
            String str = null;
            System.out.println("Length of String is " + str.length());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception!");
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException!"+ npe.getMessage());
            System.out.println("String is null!");
        }
    }
}
