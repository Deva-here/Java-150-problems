import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int even = 0, odd = 0;
        for(int i=0;i<5;i++){
            System.out.print("Enter number "+(i+1)+": ");
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even + " numbers is/are even");
        System.out.println(odd + " numbers is/are odd");
    }
}
