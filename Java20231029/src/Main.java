import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*      int n =1;
        int ret=1;
        while(n<5) {
            ret =ret*n;
            n++;
        }
        System.out.println(ret);
*/

/*      int sum=0;
        for(int j=1;j<=5;j++){
            int ret=1;
            for(int i=1;i<=j;i++){
                ret*=i;
            }

            sum+=ret;

        }
        System.out.println(sum);

        int a=0;
        do {
            System.out.println(a);
        }while(a!=0);
*/

/*

        //从键盘输入
        //要实现Java输入，要导入一个包:Sacanner
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name= scan.nextLine();//读入一行,但是nextLine是遇到空格结束
        //注意回车
        System.out.println("姓名："+name);

        System.out.println("请输入一个整数：");
        int age = scan.nextInt();
        System.out.println("年龄："+age);
        scan.close();//可以认为scan是一个资源，关上不浪费内存
*/
/*
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int age = scanner.nextInt();//都多组数据：通过scanner循环读取
            System.out.println(age);
        }
*/
/*

        //猜数字游戏
        Scanner scanner =new Scanner(System.in);
        Random random =new Random();
        int randNum = random.nextInt(101);//[0,101)
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int num =scanner.nextInt();
            if(num<randNum){
                System.out.println("猜小了！");
            } else if (num == randNum) {
                System.out.println("猜对了！");
                break;
            }else {
                System.out.println("猜大了！");
            }
        }
*/
/*

        //判断素数：若能整除2到根号n之间任何数就是素数
        for (int n = 2; n <= 100 ; n++) {
            int i = 2;
            for (; i <= Math.sqrt(n); i++) {
                if (n % i==0) {
                    break;
                }
            }
            //有几种情况：1.不符合循环条件 2.遇到break
            if (i>Math.sqrt(n)) {
                System.out.print(n+"是素数！");
            }else {
                System.out.println(n+"不是素数哦。");
            }
        }
*/
/*

        //水仙花数：一个三位数，其各位数的立方和等于这个数
        for (int i = 1; i <= 999999; i++) {

            int count =0;//记录位数
            int tmp =i;//让i不变
            while (tmp!=0){
                tmp/=10;
                count++;
            }
            tmp=i;//恢复tmp
            int sum=0;
            while (tmp!=0){
                sum+=Math.pow(tmp%10,count);
                tmp/=10;
            }

            if(sum==i){
                System.out.println(i+"是次幂数");
            }
        }
*/

        //求一个二进制数有多少个1
        int n=15;
        int cout=0;
        while (n!=0){
            n=n&(n-1);//二进制与
            cout++;
        }
        System.out.println(cout);




    }
}