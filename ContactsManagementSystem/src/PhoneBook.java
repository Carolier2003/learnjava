import java.util.ArrayList;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/12 10:37
 */
public class PhoneBook {
    private ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    //添加联系人
    public void addContact(String name, String phone) {
        contacts.add(new Contact(name, phone));
    }

    // 删除联系人
    public boolean deleteContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                contacts.remove(i);
                // 表示成功删除联系人
                return true;
            }
        }
        // 表示未找到联系人，删除失败
        return false;
    }

    // 修改联系人信息
    public boolean modifyContact( String nameToModify,String name, String newPhone) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(nameToModify)) {
                contact.setPhone(newPhone);
                contact.setName(name);
                // 表示成功修改联系人信息
                return true;
            }
        }
        // 表示未找到联系人，修改失败
        return false;
    }

    //查找联系人
    public Contact findContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("姓名：" + contact.getName() + "，电话：" + contact.getPhone());
                return contact;
            }
        }
        System.out.println(" 未找到姓名为 " + name + "的联系人");
        return null;
    }

    // 显示所有联系人，并按姓名首字母升序排序
    public String displayAllContacts() {
        if (contacts.isEmpty()) {
            return "电话本中没有联系人。";
        }

        // 按姓名首字母升序排序
        contacts.sort((contact1, contact2) -> contact1.getName().compareToIgnoreCase(contact2.getName()));

        StringBuilder result = new StringBuilder("所有联系人（按姓名首字母升序排序）：\n");
        for (Contact contact : contacts) {
            result.append("姓名：").append(contact.getName()).append("，电话：").append(contact.getPhone()).append("\n");
        }
        return result.toString();
    }
}
