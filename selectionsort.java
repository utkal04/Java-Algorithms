import java.util.Scanner;

public class selectionsort {
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
        int minpos=0;
        for(int i=0;i<size;i++)
        {
            int min=arr[i];
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<min)
                {
                    int temp=arr[i];
                   min=arr[j];
                   arr[i]=min;
                   arr[j]=temp;
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
