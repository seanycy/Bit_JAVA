
//求 N 的阶乘
public class Main1 {
    public static int fuc(int n) {
        if(n==1){
            return n;
        }
        int tmp=fuc(n-1)*n;
        return tmp;
    }

    public static void Main1(String[] args) {
        System.out.println(fuc(3));
    }

}
