import java.util.Scanner;

/**
 * @author 19667
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMana = scanner.nextInt();
        int numSkills = scanner.nextInt();
        int bossHealth = scanner.nextInt();
        boolean foundSkill = false;

        for (int i = 1; i <= numSkills; i++) {
            int skillMana = scanner.nextInt();
            int skillDamage = scanner.nextInt();

            if ((skillMana == 0 && skillDamage > 0) || (skillMana > 0 && (totalMana / skillMana) * skillDamage >= bossHealth)) {
                foundSkill = true;
                System.out.print(i + " ");
            }
        }

        if (!foundSkill) {
            System.out.print(-1);
        }
    }
}
