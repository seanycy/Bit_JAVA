import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please inter your password (you only have 3 times):");
        int pw = scanner.nextInt();
        int jd = 3;
        int pass=123456;
        for (int i = 0; i < 3; i++) {
            if(pw == pass){
                System.out.println("Correct!!!");
                break;
            }else {
                jd--;
                if (jd==0){
                    System.out.println("Sorry,you are rejected.");
                    break;
                }
                System.out.println("False,you only have "+jd+" times to try,please inter again:");
                pw = scanner.nextInt();
            }
        }
    }
}