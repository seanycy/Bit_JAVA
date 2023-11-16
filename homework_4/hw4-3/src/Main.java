//求1！+2！+3！+4！+........+n!的和

public class Main {
    public static int fuc(int n) {
        if(n==1){
            return n;
        }
        int tmp=fuc(n-1)*n;
        return tmp;
    }

    public static int sum(int n) {
        if (n == 1) {
            return fuc(n);
        }
        int sum=fuc(n)+sum(n-1);
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum(9));
    }
}