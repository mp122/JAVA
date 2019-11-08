import java.util.Scanner;
class Int_pelendrome{
    public static void main(String args[]) {
        System.out.println("Enter Number to check Pelendrome : ");
        int n = new Scanner(System.in).nextInt();
        int number = n;
        int temp=0,reminder=0;
        while(n>0)
        {
            reminder = n%10;
            temp = temp * 10 + reminder;
            n = n/10;
        }
        //System.out.println(temp);
        //System.out.println(n);
        if (number==temp)
        System.out.println("Yes! Number is Pelendrome.");
        else
        System.out.println("NO! Number is not a pelendrome.");
    }
}