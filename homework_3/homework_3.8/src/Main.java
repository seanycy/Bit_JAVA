import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("输入两个数，以空格分隔：");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("最大公约数是：" + gcd);
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }
}