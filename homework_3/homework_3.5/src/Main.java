import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type in your number:");
        int num = scanner.nextInt();
        int tmp = 0;
        int out = 0;
        tmp=num;
        while (tmp!=0){
            out = tmp%10;
            tmp/=10;
            if(tmp == out){
                System.out.print(out);
                break;
            }
            System.out.print(out+" ");
        }
    }
}