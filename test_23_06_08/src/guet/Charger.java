package guet;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/6/8 16:31
 */
//Charger.java ,请完成Charger的完整定义，使它满足主方法的输出内容和格式的要求。
public class Charger implements ICharger {
    @Override
    public boolean connectPowerline(float voltage) {
        if (voltage >= 200 && voltage <= 240) {

            return true;
        } else {
            System.out.println("交流电压不在[200,240]范围,无法充电");
            return false;
        }
    }

    @Override
    public void powerOff() {
        System.out.println("充电器停止充电");
    }

    @Override
    public int doCharge(int currentEnergy) {
        if(currentEnergy==100){
            powerOff();
            return 100;
        }
        int newEnergy = currentEnergy + 5;
        if (newEnergy > 100) {
            System.out.println("已充电到100%");
            powerOff();
            return 100;
        } else {
            System.out.println("已充电到" + newEnergy + "%");
            return newEnergy;
        }
    }
}
