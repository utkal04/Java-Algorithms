import java.util.Scanner;

class search1
{
    public static void main(String[] args) {
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the size of the array");
            int s=sc.nextInt();
            System.out.println("enter the no to be search");
            int searchNo=sc.nextInt();
            int[] array=new int[s];
            System.out.println("enter the array elements");
            for(int i=0;i<s;i++)
            {
                array[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<s;i++)
            {
                if(array[i]==searchNo)
                {
                    System.out.println(searchNo+" number found in the array");
                    c++;
                }
                if(c==1)
                break;
            }
            if(c==0)
            {
                System.out.println(searchNo+" number not there in the array ");
            }
        }
    }
}