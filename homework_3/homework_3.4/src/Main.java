import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type in your number:");
        int x = scanner.nextInt();
        while (x!=0){
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    if(i==j ){
                        if(i==x-1){
                            System.out.print("*");
                            x=0;
                            break;
                        }else {
                            System.out.print("*");
                        }
                    } else if (j==x-i-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                }
            }
        }

    }
