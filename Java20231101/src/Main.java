import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        //辗转相除法
        int a=24;
        int b =18;
        int c = a%b ;
        while(c!=0){
            a=b;
            b=c;
            c=a%b;
        }
        System.out.println(b);
    }

    public static  void main6(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=7;
        /*for (int i = 0; i < 32; i+=2) {//总共32位

        }*/
        for (int i = 30; i >=0; i-=2) {
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();
        for (int i = 31; i >=0; i-=2) {
            System.out.print(((n>>i)&1)+" ");
        }
    }
    public static  void main5(String[] args) {
        int count=3;
        Scanner in = new Scanner(System.in);
        while (count!=0){
            System.out.println("Please type in your password");
            String pass = in.nextLine();
            if(pass.equals("123456")) {
                // 判断字符串想不想等，不能用等号来判断,要用.equals方法来判断
                System.out.println("Success");
                break;
            }else {
                count--;
            }
        }
    }
    public static  void main4(String[] args) {
        int n=123;
        while (n!=0){
            System.out.println(n%10);
            n/=10;
        }
    }

    public static  void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){//括号中实现循环输入
            int a = in.nextInt();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (j == i || i+j==(a-1)) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static  void main2(String[] args) {
        double sum = 0;
        int flg = 1;
        for (int i = 1;i<=100;i++){
            sum+=1.0/i*flg;
            flg=-flg;//做一个标记，每次取反
        }
        System.out.println(sum);
    }

    public static void main1(String[] args) {
        int count = 0;
        for (int i = 1; i <=100 ; i++) {
            if(i / 10 == 9) {
                //十位是九
                count++;
            }
            if (i % 10 == 9) {
                //个位是九
                count++;
            }
        }
        System.out.println(count);
    }
}