import java.util.Scanner;

class prime{
    public static void main(String args[]) {
        int flag=0;
        System.out.println("Enter Number is to check Prime or Not : ");
        int n = new Scanner(System.in).nextInt();
        for (int i= 2 ; i<n; i++){
            if (n%i == 0){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Yes! it is a Prime Number.");
        }
        else{
            System.out.println("NO! it is not Prime Number.");
        }
    }
}