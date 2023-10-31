import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("输入数字：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // 要获取二进制序列的数

        String binaryString = Integer.toBinaryString(number); // 将数转换为二进制字符串

        String evenBits = ""; // 偶数位的二进制序列
        String oddBits = ""; // 奇数位的二进制序列

        // 遍历二进制字符串中的字符
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char c = binaryString.charAt(i);

            // 判断位置是否为偶数位
            if (i % 2 == 0) {
                evenBits = c + evenBits;
            } else {
                oddBits = c + oddBits;
            }
        }

        System.out.println("偶数位的二进制序列: " + evenBits);
        System.out.println("奇数位的二进制序列: " + oddBits);
    }
}