public class Main {
    public static int fuc(int n) {
        if(n==1){
            return n;
        }
        int tmp=fuc(n-1)*n;
        return tmp;
    }
    public static void main(String[] args) {
        System.out.println(fuc(9));
    }
}