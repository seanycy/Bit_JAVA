import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuessNumberGame {
    private int cnt;
    private int truenb;

    public GuessNumberGame() {
        cnt = 0;
        generate();
    }

    public void generate() {
        Random r = new Random();
        truenb = r.nextInt(1000) + 1;
    }

    public String guess(int number) {
        cnt++;
        if (number < truenb) {
            return "猜测的数太小!";
        } else if (number > truenb) {
            return "猜测的数太大!";
        } else {
            return "恭喜你猜对了";
        }
    }

    public int getCount() {
        return cnt;
    }
}

public class Gs extends JPanel implements ActionListener {
    private GuessNumberGame game;
    private JPanel all;
    private JLabel lb1, lb3, lb4;
    private JButton bnt1, bnt2, bnt3;
    private JTextField inp;

    public Gs() {
        game = new GuessNumberGame();
        // UI初始化...
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bnt1) {
            int guess = Integer.parseInt(inp.getText());
            String result = game.guess(guess);
            lb3.setText(result);
            // 更新UI...
        } else if (e.getSource() == bnt2) {
            game = new GuessNumberGame();
            // 重置UI...
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Gs panel = new Gs();
            JFrame frame = new JFrame("猜数游戏");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(250, 200, 450, 350);
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}