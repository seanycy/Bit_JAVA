//完成猜数字游戏，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rnum =random.nextInt(101);
        while (true){
            System.out.println("Please type in the number you just guessed:");
            int gnum = scanner.nextInt();
            if (gnum == rnum) {
                System.out.println("Congratulations！It's proper.");
                break;
            } else if (gnum < rnum) {
                System.out.println("Sorry,it's smaller.");
            }else {
                System.out.println("Sorry,it's bigger.");
            }
        }

    }
}