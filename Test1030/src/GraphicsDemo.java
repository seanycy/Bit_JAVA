import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsDemo {
    private JFrame frame;
    private DrawingPanel panel;
    private Shape currentShape;

    public static void main(String[] args) {
        GraphicsDemo demo = new GraphicsDemo();
        demo.createUI();
    }

    private void createUI() {
        frame = new JFrame("Graphics Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        panel = new DrawingPanel();

        JButton ovalButton = new JButton("椭圆");
        ovalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentShape = new OvalShape();
                panel.repaint();
            }
        });

        JButton rectangleButton = new JButton("矩形");
        rectangleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentShape = new RectangleShape();
                panel.repaint();
            }
        });

        JButton lineButton = new JButton("直线");
        lineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentShape = new LineShape();
                panel.repaint();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(ovalButton);
        buttonPanel.add(rectangleButton);
        buttonPanel.add(lineButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private abstract class Shape {
        public abstract void draw(Graphics g);
    }

    private class OvalShape extends Shape {
        @Override
        public void draw(Graphics g) {
            g.drawOval(50, 50, 100, 50);
        }
    }

    private class RectangleShape extends Shape {
        @Override
        public void draw(Graphics g) {
            g.drawRect(50, 50, 100, 50);
        }
    }

    private class LineShape extends Shape {
        @Override
        public void draw(Graphics g) {
            g.drawLine(50, 50, 150, 100);
        }
    }

    private class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (currentShape != null) {
                currentShape.draw(g);
            }
        }
    }
}