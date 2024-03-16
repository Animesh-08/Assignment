import java.util.Scanner;

class MyArray 
{
    int size;
    int arr[];
    Scanner sc = new Scanner(System.in);

    MyArray(int size) 
{
        this.size = size;
        arr = new int[size];
    }

    void set(int size) {
        int i;
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void Display(int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]" + " =" + arr[i]);
        }
    }

    void Sumavg(int size) {
        int i, sum = 0;
        float avg = 0.0f;
        for (i = 0; i < size; i++) {
            sum += arr[i];
        }
        avg = (float) (sum) / size;
        System.out.println("The Sum is :" + sum);
        System.out.println("The Avg is :" + avg);
    }

void Swap(int size)
{
int max=0,c1=0,c2=0,i;
int min;
max=min=arr[0];
for(i=1;i<size;i++)
{
if(max<arr[i])
{
max=arr[i];
c1=i;
}
if(min>arr[i])
{
min=arr[i];
c2=i;
}
}
int temp;
temp=arr[c1];
arr[c1]=arr[c2];
arr[c2]=temp;
}

void Frequency(int size)
{
    int fr[]=new int[size];
    int i,j,visited=-1;
    for(i=0;i<size;i++)
    {
        int count=1;
        if(fr[i]!=visited)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    fr[j]=visited;
                }
            }
        }
        if(fr[i]!=visited)
        {
            fr[i]=count;
        }
    }
    for(i=0;i<size;i++)
    {
        if(fr[i]!=visited)
        {
            System.out.println(" "+arr[i]+"  occurs "+fr[i]+"  times");
        }
    }
}
static int Single(int n)
{
int sum = 0;
while (n > 9) 
{
    sum = 0;
    while (n != 0)
    {
        int rem = n % 10;
        sum += rem;
        n /= 10;
    }
    n = sum;
}
return n;
}
void Calculation(int size)
{
    
        int i, j, range = 3,k=1;

        for (i = 0; i < size - (size % 3); i += 3) {

            int sum = 0;
            for (j = i; j < (range * k); j++) {
                if(arr[j]>9)
                {
                    int temp=arr[j];
                    arr[j]=Single(temp);
                }
                
                sum = ((sum * 10) + arr[j]);

            }
            arr[k - 1] = sum;
            k += 1;
        }
   
        int sum3 = 0;
        for (i = size - (size % 3); i <= size - 1; i++) {
            if (arr[i] > 9) {
                int temp = arr[i];
                arr[i]=Single(temp);
                
            }
     
            if ((range - (size % 3) == 2)) {
                sum3 = arr[i] * 100;

            } else {
                sum3 = sum3 * 10 + arr[i];
                if (sum3 > 9) {
                    sum3 *= 10;

                }

            }
        }
  

        arr[k - 1] = sum3;
        if (size % 3 == 0) {
            size /= 3;
        } else {
            size = (size / 3) + 1;
        }
        System.out.println("Output:---------");
    
        for (i = 0; i < size; i++) {
            System.out.println("arr["+i+"]="+arr[i]);
        }
    
}
}

class Array_Ass9{
public static void main(String args[])
{
int x,y;
System.out.println("Enter the size :");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
MyArray obj=new MyArray(x);
obj.set(x);
obj.Sumavg(x);
obj.Swap(x);
obj.Display(x);
obj.Frequency(x);
System.out.println("Enter the new array :");
System.out.println("Enter the size of the array :");
y=sc.nextInt();
MyArray obj1=new MyArray(y);
obj1.set(y);
obj1.Calculation(y);
}
}
