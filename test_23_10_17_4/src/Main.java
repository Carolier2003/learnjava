/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/17 17:15
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] floors = new int[n];
        int maxFloor = 0;  // 最远楼层
        for (int i = 0; i < n; i++) {
            floors[i] = sc.nextInt();
            maxFloor = Math.max(maxFloor, Math.abs(floors[i]));  // 取绝对值，考虑下行的情况
        }

        int time = 0;
        int perUp = 6;
        int perDown = 4;
        int openTheDoor = 5;
        int arrive = 1;

        // 上升到最高楼层
        time += maxFloor * perUp;

        // 计算每一位乘客的时间并取最小值
        for (int i = 0; i < n; i++) {
            int target = floors[i];
            int absTarget = Math.abs(target);
            int upTime = absTarget * perUp + openTheDoor + arrive;
            int downTime = absTarget * perDown + openTheDoor + arrive;
            time += Math.min(upTime, downTime);
        }

        // 返回到0层
        time += maxFloor * perDown;

        System.out.println(time);
    }
}
