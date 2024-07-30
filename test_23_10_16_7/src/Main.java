import java.util.Scanner;

/**
 * @author 19667
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean[][] board = new boolean[4][4];

        if (s.length() < 9) {
            if (s.length() % 2 == 0) {
                System.out.println("uim wins.");
            }
            else {
                System.out.println("xiaoa wins.");
            }
            return;
        }

        for (int i = 0; i <= 8; i++) {
            if (i % 2 == 0) {
                int x = (s.charAt(i) - '1') / 3 + 1;
                int y = (s.charAt(i) - '1') % 3 + 1;
                board[x][y] = true;
            }
        }

        for (int i = 1; i <= 3; i++) {
            if (board[i][1] && board[i][2] && board[i][3] ||
                    board[1][i] && board[2][i] && board[3][i] ||
                    board[1][1] && board[2][2] && board[3][3] ||
                    board[3][1] && board[2][2] && board[1][3]) {
                System.out.println("xiaoa wins.");
                return;
            } else if (!board[i][1] && !board[i][2] && !board[i][3] ||
                    !board[1][i] && !board[2][i] && !board[3][i] ||
                    board[1][1] && board[2][2] && board[3][3] ||
                    board[3][1] && board[2][2] && board[1][3]) {
                System.out.println("uim wins.");
                return;
            }
        }

        System.out.println("drew.");
    }
}
