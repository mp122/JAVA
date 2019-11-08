import java.util.Scanner;
class duplicate_remove_array{
    public static void main(String args[]) {
        int a[] = new int[50];
        System.out.println("How many Numbers : ");
        int size = new Scanner(System.in).nextInt();
        System.out.println("Enter "+size+" Numbers into Array : ");
        int b[] = new int[size];
        for (int i=0; i<size; i++)
        a[i]= new Scanner(System.in).nextInt();
        System.out.println("Array is :");
        for (int i=0; i<size ; i++)
        {
        System.out.print(a[i]+" ");
        b[i]=0;
        }
        System.out.println("\nlength of B array :"+b.length);
        int t=0;
        for(int i=0 ;i<b.length; i++)
        {
            for(int j=0;j<size; j++)
            {
                if(a[i]==b[j])
                {
                    break;
                }
                else
                {
                    b[t]=a[i];
                    t++;
                }
            }
        }
        System.out.print("After Remove Duplicate Elements :");
        for (int i=0; i<b.length;i++)
        System.out.print(a[i]+" ");
    }
}