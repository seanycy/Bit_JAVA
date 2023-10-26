import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;
import java.awt.Graphics;

// 抽象类 MyShape
abstract class MyShape {
    private double x1, y1, x2, y2;

    // 无参构造方法
    public MyShape() {
        x1 = y1 = x2 = y2 = 0;
    }

    // 有参构造方法
    public MyShape(double a, double b, double c, double d) {
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
    }

    // 获取坐标方法
    public double getx1() {
        return x1;
    }

    public double getx2() {
        return x2;
    }

    public double gety1() {
        return y1;
    }

    public double gety2() {
        return y2;
    }

    // 设置坐标方法
    public void setx1(double a) {
        x1 = a;
    }

    public void setx2(double a) {
        x2 = a;
    }

    public void sety1(double a) {
        y1 = a;
    }

    public void sety2(double a) {
        y2 = a;
    }

    // 抽象方法 draw，用于绘制图形
    abstract void draw(Graphics g);
}
// 继承自MyShape的MyLine类
class MyLine extends MyShape {
    // 构造方法，接收四个参数
    public MyLine(double a, double b, double c, double d) {
        // 调用父类的构造方法，传入参数
        super(a, b, c, d);
    }
    // 绘制方法，接收一个Graphics对象作为参数
    public void draw(Graphics g) {
        // 将传入的Graphics对象转化为Graphics2D对象
        Graphics2D g2 = (Graphics2D) g;

        // 创建一个Line2D对象
        Line2D xy = new Line2D.Double();

        // 设置Line2D对象的起始点和终点坐标
        xy.setLine(getx1(), gety1(), getx2(), gety2());

        // 绘制Line2D对象
        g2.draw(xy);
    }
}
class MyRectangle extends MyShape{
    public MyRectangle(double a,double b,double c,double d){
        super(a,b,c,d);
    }
    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        Rectangle2D xy=new Rectangle2D.Double();
        xy.setRect(getx1(), gety1(),Math.abs(getx2()-getx1()) ,Math.abs(gety2()-gety1()) );
        g2.draw(xy);
    }

}
class MyOval extends MyShape{
    public MyOval(double a,double b,double c,double d){
        super(a,b,c,d);
    }
    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        Ellipse2D xy=new Ellipse2D.Double();
        xy.setFrame(getx1(), gety1(),Math.abs(getx2()-getx1()) ,Math.abs(gety2()-gety1()) );
        g2.draw(xy);
    }

}
class drawall extends JComponent{
    public void paintComponent(Graphics g){
        // super.paintComponent(g);
        MyShape rs;
        for(int i=1;i<=20;i++)     //画20个图形
        {
            Random nd=new Random();
            int op=nd.nextInt(3);       //0、1、2对应直线、矩形、椭圆
            // double x1=nd.nextDouble(600),y1=nd.nextDouble((Double)600.0),x2=nd.nextDouble((Double)600.0),y2=nd.nextDouble((Double)600.0);
            double x1 = Math.random() * 600 % 601;
            double y1 = Math.random() * 600 % 601;
            double x2 = Math.random() * 600 % 601;
            double y2 = Math.random() * 600 % 601;
            if(op==0){
                rs=new MyLine(x1,y1,x2,y2);
                rs.draw(g);
            }
            else if(op==1){
                rs=new MyRectangle(x1,y1,x2,y2);
                rs.draw(g);
            }
            else{
                rs=new MyOval(x1,y1,x2,y2);
                rs.draw(g);
            }
        }
    }
}
class mjf extends JFrame{
    public mjf(){
        add(new drawall());
        // pack();
    }
}
public class Main {
    public static void main(String[] args) {
        mjf jf=new mjf();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("f(x)=x^2函数图像的绘制");
        jf.setVisible(true);
        jf.setSize(800,600);
    }
}
