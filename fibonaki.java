import java.util.Scanner;
class fibonaki
{
    public static void main(String args[])
    {
     System.out.println("Enter Number Upto Fibonaki Print : ");
     int n = new Scanner(System.in).nextInt();
     int t1 = 0, t2 = 1, nextTerm;
     System.out.println("Fibonaki Series :\n");
        for (int i =0 ; i<=n; i++)
        {
            System.out.print(t1+" ");
            nextTerm = t1+t2;
            t1=t2;
            t2=nextTerm;
        } 
    }
}