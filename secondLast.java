import java.util.Scanner;

public class secondLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a =  sc.nextInt();
        System.out.println(a>=10 ? ("The second last  digit of the number is "+ (a%100)/10) : "Enter a number more than 10");
    }
}
