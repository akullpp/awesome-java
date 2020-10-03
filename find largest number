import java.util.Scanner;
public class Largest_Number 
{
    public static void main(String[] args) 
    {
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
}
