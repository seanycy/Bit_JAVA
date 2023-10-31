public class Main {
    public static void main(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int tmp=0;
        int count=0;
        for (int i = 1; i <= 100; i++) {
            tmp=i;
            while (tmp%10==9){
                count++;
                tmp/=10;
            }
        }
        System.out.println("100以内总共有"+count+"个9。");
    }
}
//9 99