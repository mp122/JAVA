import java.util.Scanner;
class factorial{
    public static void main(String args[]) {
        int fact = 1,i=1;
        System.out.println("Enter Number to find Factorial : ");
        int n = new Scanner(System.in).nextInt();
        while(i<=n){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of given number is: "+fact);

    }
}