/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/12 14:01
 */
import java.io.*;
import java.util.ArrayList;

public class FilePhoneBook {
    private static final String FILE_PATH = "phonebook.txt";

    public static void saveContactsToFile(ArrayList<Contact> contacts) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Contact contact : contacts) {
                writer.println(contact.getName() + "," + contact.getPhone());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Contact> loadContactsFromFile() {
        ArrayList<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    contacts.add(new Contact(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }
}

