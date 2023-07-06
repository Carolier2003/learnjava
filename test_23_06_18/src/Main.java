import java.util.Scanner;

/**
 * {@code @Author} ${USER}
 * {@code @create} ${DATE} ${TIME}
 */
class ScoreException extends Exception {
    int number;

    ScoreException(int number) {
        this.number = number;
    }

    int getMess() {
        return number;
    }
}

class Teacher {
    public int giveScore(int score) throws ScoreException {
        if (score > 100 || score < 0)

            throw new ScoreException(score);
        return score;
    }
}

public class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        sc.hasNextInt();
        Teacher t = new Teacher();
        int m = 0, n = 0;
        try {
            m = t.giveScore(100);
            m = t.giveScore(101);
        } catch (ScoreException e) {
            n = e.getMess();
        }
        System.out.printf("%d:%d", m, n);
    }
}