import java.util.Scanner;
public class Main
{
    public static void main(String [ ] args)
    {
        Scanner in=new Scanner(System.in);
        double side1,side2,side3;
        side1=in.nextDouble();
        side2=in.nextDouble();
        side3=in.nextDouble();
        //下面的代码创建Triangle对象，使用try catch处理异常
        try {
            Triangle TR=new Triangle(side1,side2,side3);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }

    }
    static class Triangle
    {
        private double side1;
        private double side2;
        private double side3;
        public Triangle(double side1,double side2,double side3) throws IllegalTriangleException
        {//初始化，如果出现两条边之和小于等于第三边，则抛出 IllegalTriangleException异常对象
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
            if(this.side1+this.side2<=this.side3||this.side1+this.side3<=this.side2||this.side2+this.side3<=this.side1)
            {
                throw new IllegalTriangleException("边长不符合要求");
            }

            System.out.println("三角形创建成功");
        }
    }
}


class  IllegalTriangleException extends Exception
{//下面的代码定义异常类
    public IllegalTriangleException(String message){
        super(message);
    }
}