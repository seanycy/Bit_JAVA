public class Main {
    public static int max(int x,int y) {

        if(x>=y){
            return x;
        }else {
            return y;
        }
    }
    public static double max(double x,double y,double z) {
        if(x>=y){
            if(x>=z){
                return x;
            } else{
                return z;
            }
        }else {
            if(y>=z){
                return y;
            }else {
                return z;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(max(6,19));
        System.out.println(max(8.99,7.38,4.21));
    }
}