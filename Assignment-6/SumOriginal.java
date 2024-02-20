import java.util.Scanner;
class SumOriginal {
    public static void main(String args[])
    {
    int n,sum=0,temp1=0,temp2=0,rem1=0,rem2=0,rem=0,temp3=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    temp1=temp2=n;
    while(n!=0)
    {
        rem=n%10;
        sum+=rem;
        n/=10;
    }
    System.out.println("The sum of the given no is :"+sum);

    while(sum!=0)
    {
        rem1=sum%10;
        sum/=10;
        temp1=temp2;
        while(temp1!=0)
        {
            rem2=temp1%10;
            if(rem2==rem1)
            {
                if(temp3!=rem2)
                {
                System.out.println(rem1+" is present in "+temp2);
                }
                temp3=rem1;
            }
           
            temp1/=10;

        }
    }
}
}
