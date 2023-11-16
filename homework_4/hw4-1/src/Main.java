/*创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
      要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算*/

public class Main {
    public static int max2(int x,int y) {
        if(x>=y) {
            return x;
        }else {
            return y;
        }
    }

    public static int max3(int x,int y ,int z) {
        if(max2(x,y) >= z) {
            return max2(x,y);
        } else{
            return z;
        }
    }


    public static void main(String[] args) {
        System.out.println(max2(2,3));
        System.out.println(max3(2,3,4));
    }
}