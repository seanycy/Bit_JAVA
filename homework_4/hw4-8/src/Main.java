public class Main {
    public static void move(int n, int startPole, int intermediatePole, int endPole) {
        if (n == 1) {
            System.out.println("Move disk 1 from pole " + startPole + " to pole " + endPole);
            return;
        }

        move(n-1, startPole, endPole, intermediatePole);
        System.out.println("Move disk " + n + " from pole " + startPole + " to pole " + endPole);
        move(n-1, intermediatePole, startPole, endPole);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3;
        move(numberOfDisks, 1, 2, 3);
    }
}