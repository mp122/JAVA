import java.util.Scanner;
class amstrong_number{
    public static void main(String args[]) {
        System.out.println("Enter Number to check Amstrong Number :");
        int n = new Scanner(System.in).nextInt();
        int temp=0,number=n,sum=0;
        while(number>0){
            temp = number%10;
            sum += temp*temp*temp;
            number /=10; 
        }
        if (n==sum)
            System.out.println("Yes! Number is Amstrong.");
        else
            System.out.println("NO! Number is NOT Amstrong.");
    }
}