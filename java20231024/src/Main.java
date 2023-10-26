import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        int a=10;
        long b=100L;
        //a = b;//不可以赋值8字节数据给4字节数据
        a = (int)b;//强制类型转换！！！
        b = a;
    }
    public static void main4(String[] args) {
        //Java中，真假只有true和false
        boolean flg=true;
        System.out.println(flg);//在JVM中布尔类型占几个比特位是没有明确规定的
        //布尔类型的包装类型是Boolean
        //布尔类型不能和任何类型进行转换
    }
    public static void main3(String[] args){
        //没有负数
        char ch = 'A';//2个字节，与C不同
        System.out.println(ch);
        char ch2='高';
        System.out.println(ch2);//Java中用Unicode
    }

    public static void main2(String[] args) {
        int a=1;
        int b=2;
        System.out.println(a/b);//从数学上而言是0.5，但此时程序不能保存小数，只会运行整数部分

        double num=1.1;
        System.out.println(num*num);//精确到小数点后XXX位

    }

    public static void main1(String[] args) {

        System.out.println("Hello world!");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);

        long b=10L;
        System.out.println(b);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("====================");
        short sh =10;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("====================");
        byte b1=10;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("====================");
        double d =12.5; //八字节
        System.out.println(Double.MIN_VALUE);
        //输出浮点数中最小的一个非负整数
        System.out.println(Double.MAX_VALUE);
        System.out.println("====================");
        float f=12.5f;//四字节,加上小写f表示单精度浮点类型，不加f计算机只会认为是double
        System.out.println(f);
        System.out.println();
    }
}