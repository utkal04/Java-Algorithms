import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        System.out.println("array after sorting");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
