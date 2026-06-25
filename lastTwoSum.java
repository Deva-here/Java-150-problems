import java.util.Scanner;

public class lastTwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            boolean flag = true;
            while(flag){
                System.out.print("Enter a two digit number: ");
                int a = sc.nextInt();
                if(a >= 10){
                    System.out.println((a%10)+((a%100)/10));
                    flag = false;
                }
                else{
                    System.out.println("Enter atleast a 2 digit number");

                }
            }
        }
    }


