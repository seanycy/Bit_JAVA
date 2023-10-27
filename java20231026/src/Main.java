import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        /*System.out.println(5/2);//两个整数输出结果不会存储小数位
        System.out.println((float)5/2);
        System.out.println(5/(float)2);
        System.out.println((float) (5/2));//对整数2进行强制类型转换
        System.out.println("====================");
        System.out.println(10%3);
        System.out.println(10%-3);
        System.out.println(-10%3);
        System.out.println(-10%-3);
        System.out.println(11.5%2);*/

        /*int a=10;
        a+=10; //a=a+10
        System.out.println(a);
        long b =100;
        int c=9;
        //c = c +d;
        c+=d;//特点：运算符会帮我们进行类型转换，c=(int)(c+d)
        System.out.println(c);*/

        /*int a = 10;
        int b = ++a;//a=a+1,b=a
        a--;
        int c = a++;//c=a,a=a+1
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

        int a = 10;
        int b = 20;
        // 注意：在Java中 = 表示赋值，要与数学中的含义区分
        // 在Java中 == 表示相等
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a < b); // true
        System.out.println(a > b); // false
        System.out.println(a <= b); // true
        System.out.println(a >= b); // false
        //关系运算符结果只有true或者false，没有其他结构
    }

    public static void main7(String[] args) {
        //在C语言中没有字符串这种类型的是数据
        String str="hello";//双引号当中包含若干字符串
        System.out.println(str);
        System.out.println("====================");
        int a=100;
        String s1=String.valueOf(a);
        //调用string类型的库方法：给一个整数，输出一个字符串
        System.out.println(s1);
        String s2=a+"hellox";//此加号表示拼接的意思
        System.out.println(s2);
        //注释快捷键：ctrl+shif+/——>快注释
        //行注释：ctrl+/

        String s3 =10+20+"hello";//先是数值10和数值20相加，结果为30去和字符串hello拼接
        String s4 ="hello"+10+20;//先是hello和10拼接后就是一个字符串“hello10”，然后这个字符去和20拼接
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("====================");
        String str3="1009";
        int ret=Integer.valueOf(str3);//调用integer的方法来实现转换
        System.out.println(ret+1);
        int ret2=Integer.valueOf(str3);
        System.out.println(ret2+2);
    }
    public static void main6(String[] args){
        int a=10;
        long b=20;
        int c = (int) (a+b);//等号右边a会自动被转换为long类型，等号的左边是int类型
        long d = a+b;
        System.out.println(c);
        System.out.println(d);
        System.out.println("====================");
        byte b1 = 125;
        byte b2 =12;
        byte b3 = (byte) (b1+b2);//小于4字节的内容，会被提升为int参与运算
        System.out.println(b3);//显示为负数，超出对应数据类型范围，发生截断
        int b4=b1+b2;
        System.out.println(b4);
        System.out.println("====================");

    }
    public static void main5(String[] args) {
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