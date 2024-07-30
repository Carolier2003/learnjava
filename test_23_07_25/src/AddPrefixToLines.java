import java.awt.*;
import java.io.*;

public class AddPrefixToLines {

    public static void addNewlineBeforeCharacter(String inputFilePath, String outputFilePath, char targetCharacter) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replace(Character.toString(targetCharacter), "\n" + targetCharacter);
                writer.write(modifiedLine);
                writer.newLine();
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "D:\\Users\\19667\\Desktop\\IPTV20221007\\工作簿1.txt";
        String outputFilePath = "D:\\Users\\19667\\Desktop\\IPTV20221007\\iptv.txt";
        char targetCharacter = 'r'; // 设置要在其前添加换行的目标字符

        addNewlineBeforeCharacter(inputFilePath, outputFilePath, targetCharacter);
    }
}
