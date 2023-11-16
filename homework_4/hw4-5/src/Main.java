// 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果

public class Main {
    public static int add(int x,int y){
        return x+y;
    }
    public static double add(double x,double y,double z) {
        return x+y+z;
    }
    public static void main(String[] args) {

        System.out.println(add(5,8));
        System.out.println(add(3.2,7.9,6.4));
    }
}