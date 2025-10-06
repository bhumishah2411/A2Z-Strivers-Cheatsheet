import java.util.Scanner;

public class io {
    public static void printNumber() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  
        System.out.print(num);
    }

    public static void main(String[] args) {
        printNumber();
    }
}
