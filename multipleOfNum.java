import java.util.Scanner;

public class multipleOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.println((n%m==0) ? n + " is a multiple of " + m : n + " is NOT a multiple of " + m);
    }
}
