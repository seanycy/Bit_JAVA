import java.util.Random;
import javax.swing.*;
public class Main {
    public static boolean check(StringBuffer st, int pos) {
        char des = st.charAt(pos);
        char[] s = new char[10];
        for (int i = 1; i <= 9; i++) {
            s[i] = st.charAt(i);
        }
        int[][] winPositions = {{3, 6, 9}, {1, 4, 7}, {2, 5, 8}, {1, 3, 2}, {6, 4, 5}, {9, 7, 8}, {1, 5, 9}, {3, 5, 7}};
        for (int[] position : winPositions) {
            if (s[position[0]] == des && s[position[1]] == des && s[position[2]] == des) {
                return true;
            }
        }
        return false;
    }

    public class TicTacToe {

        public static void main(String[] args) {
            String[] board = new String[9]; // 初始化空白棋盘
            Random random = new Random();
            int moveCount = 0;

            while (true) {
                int playerMove = getPlayerMove(board);

                // 在玩家落子位置下子
                board[playerMove] = "X";

                // 检查玩家是否赢得游戏
                if (checkWin(board, "X")) {
                    showBoard(board);
                    JOptionPane.showMessageDialog(null, "恭喜你，你赢了！");
                    break;
                }

                moveCount++;

                // 如果棋盘已满，平局
                if (moveCount == 9) {
                    showBoard(board);
                    JOptionPane.showMessageDialog(null, "平局！");
                    break;
                }

                int computerMove = getComputerMove(board, random);

                // 在电脑落子位置下子
                board[computerMove] = "O";

                // 检查电脑是否赢得游戏
                if (checkWin(board, "O")) {
                    showBoard(board);
                    JOptionPane.showMessageDialog(null, "你输了，再接再厉吧！");
                    break;
                }

                moveCount++;
            }
        }

        // 获取玩家落子位置
        public static int getPlayerMove(String[] board) {
            while (true) {
                String input = JOptionPane.showInputDialog(showBoard(board) + "请输入落子位置(1~9)：");
                int move = Integer.parseInt(input) - 1;

                // 检查输入是否有效
                if (move >= 0 && move < 9 && board[move] == null) {
                    return move;
                } else {
                    JOptionPane.showMessageDialog(null, "输入错误，请重新输入落子的位置：" + showBoard(board));
                }
            }
        }

        // 获取电脑落子位置
        public static int getComputerMove(String[] board, Random random) {
            int move;

            // 随机生成电脑落子位置，直到找到合法位置
            do {
                move = random.nextInt(9);
            } while (board[move] != null);

            return move;
        }

        // 检查是否获胜
        public static boolean checkWin(String[] board, String player) {
            int[][] winConditions = {
                    {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // 横线
                    {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // 竖线
                    {0, 4, 8}, {2, 4, 6} // 对角线
            };

            for (int[] condition : winConditions) {
                if (board[condition[0]] != null && board[condition[0]].equals(player) &&
                        board[condition[1]] != null && board[condition[1]].equals(player) &&
                        board[condition[2]] != null && board[condition[2]].equals(player)) {
                    return true;
                }
            }

            return false;
        }

        // 显示棋盘
        public static String showBoard(String[] board) {
            StringBuilder sb = new StringBuilder();

            sb.append("-------------------\n");
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 3; j++) {
                    if (board[i + j] == null) {
                        sb.append("|  ").append(i + j + 1).append("  ");
                    } else {
                        sb.append("|  ").append(board[i + j]).append("  ");
                    }
                }
                sb.append("|\n");
                sb.append("-------------------\n");
            }

            return sb.toString();
        }
    }
}
