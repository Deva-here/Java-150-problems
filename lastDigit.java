import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a =  sc.nextInt();
        System.out.println("The last digit of the number is "+ a%10);
    }
}
