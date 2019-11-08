import java.util.Scanner;

import jdk.nashorn.api.tree.ContinueTree;
class find_gcd{

    private static int findgcd(int a, int b) {    
        if (b==0)
        return a;
        return findgcd(b,a%b);
    }

    public static void main(String args[]) {
        System.out.println("Enter A :");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter B :");
        int b = new Scanner(System.in).nextInt();
        System.out.println("GCD of two Numbers : "+findgcd(a,b));
        
    }
}