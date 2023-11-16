//求斐波那契数列的第n项。(迭代实现)

public class Main {
    public static int fib(int n) {
        if(n==1||n==2) {
            return n-1;
        }
        int f1=0;
        int f2=1;
        int f=0;
        for (int i = 3; i <=n ; i++) {
            f=f1+f2;
            f1=f2;
            f2=f;
        }
        return f;
    }
    public static void main(String[] args) {

        System.out.println(fib(8));
    }
}