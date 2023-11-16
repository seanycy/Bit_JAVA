import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array={1,2,3,4,5};

        int[] copy=new int[array.length];//申请一个和原数组一模一样大的数组
        for (int i = 0; i < array.length; i++) {
            copy[i]=array[i];
        }
        System.out.println(Arrays.toString(copy));

        //以下代码是不是拷贝？
        int[] array2={0,2,3,4,5};
        int[] array3=array2;
        System.out.println(Arrays.toString(array3));
    }

    public static String myToString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret+=array[i];
            if(i != array.length-1) {
                ret+=",";
            }
        }
        ret+="]";
        return ret;
    }
    public static void main7(String[] args) {
        int[] arrey={1,2,3,4,5};
        String ret=myToString(arrey);
        System.out.println(ret);
    }
    public static int[] func3() {
        int[] array={1,2,3,4,5};
        //return array;
        return new int[]{1,2,3,4,5,6};
    }

    public static void main6(String[] args) {
        int[] ret=func3();
        //借助工具类 将参数数组转化为字符串输出
        String s = Arrays.toString(ret);//用toString方法将数组以字符串形式返回
        System.out.println(s);//ctrl加鼠标点击可以看到Java源码
        System.out.println(Arrays.toString(ret));

        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i]+" ");
        }
    }

    public static void func1(int[] array) {
        array = new int[10];
    }
    public static void func2(int[] array) {
        array[0]=99;
    }

    public static void main5 (String[] args) {
        int[] array1={1,2,3,4};
        func1(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]+" ");
        }
        System.out.println();
        int[] array2={1,2,3,4};
        func2(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]+" ");
        }
    }


    public static void main4 (String[] args){
        int[] array={1,2,3,4};
        int[] array2=array;

        int[] array3 = null;
        System.out.println();
    }
    public static void main3 (String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(array[0]);
        System.out.println(array.length);
        for (int i = 0;i < array.length;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        //for each循环/增强for循环
        //x用来接受数组内容
        for (int x:array) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main2 (String[] args) {
        char[] array = new char[10];

        double[] array2 = new double[10];

        boolean[] array3 = new boolean[10];

        String[] strings = new String[10];
    }

    public static void main1(String[] args) {
        int[] array={1,2,3,4};

        int[] array2= new int[10];//定义了一个大小为10的整型数组，内部数值全部初始化为0

        int[] array3 = new int[]{1,2,3,4,5,6,7};//赋值后中括号中不可以规定数组大小

        System.out.println(array3);//输出的不是数组内容而是地址，@符号后面的内容不是真是地址，是一个哈希值

        int[] array4;
        array4 = new int[10];
        int[] array5;
        array5 = new int[]{1,2,3,4,5,6};


    }
}