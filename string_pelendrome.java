import java.util.Scanner;
class string_pelendrome{
    public static void main(String args[]) {
        System.out.println("Enter String to check Pelendrome : ");
        String s = new Scanner(System.in).nextLine();
        String s1 = "";
        for (int i = s.length()-1; i>=0; i--){
            s1 = s1 + s.charAt(i);
        }
        //System.out.println(s1);
        if (s1.equals(s))
        System.out.println("Yes! String is Pelendrome.");
        else
        System.out.println("NO! String is not a pelendrome.");
    }
}