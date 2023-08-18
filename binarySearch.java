import java.util.Scanner;

class bs1
{
  public static void main(String[] args) {
    {
        int arr[]={1,2,34,55,66,77,87};
        int start=0,mid=0,end=6,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the targeted number");
        int target=sc.nextInt();
        for(int i=0;i<7;i++)
        {
            System.out.println(arr[i]);
        }
        mid=(start+end)/2;
        while(start<=end)
        {
            if(target==arr[mid])
            {
                c=c+1;
                break;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            mid=(start+end)/2;
        }
        if(c>0)
        {
            System.out.println(target+" found in the array");
        }
        else{
            System.out.println("target missing");
        }
    }
  }  
}