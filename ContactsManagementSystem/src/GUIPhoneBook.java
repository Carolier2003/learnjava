import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author 19667
 */
public class GUIPhoneBook extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel statusLabel;
    private JFrame loginFrame;
    private final PhoneBook phoneBook;

    public GUIPhoneBook() {
        setTitle("电话本管理系统");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        phoneBook = new PhoneBook();
    }

    private void initializeLoginPanel() {
        // 创建组件
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("登录");
        statusLabel = new JLabel("");

        // 设置登录按钮的大小
        loginButton.setPreferredSize(new Dimension(100, 30));

        // 添加登录按钮的动作监听器
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (validateUser(username, password)) {
                statusLabel.setText("登录成功！");
                // 显示主界面
                showMainInterface();
                // 用户成功登录时加载联系人数据
                loadContacts();
                // 关闭登录窗口
                loginFrame.dispose();
            } else {
                statusLabel.setText("用户名或密码错误！");
            }
        });

        // 创建登录面板
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        loginPanel.add(new JLabel("用户名:"), gbc);
        gbc.gridy++;
        loginPanel.add(usernameField, gbc);
        gbc.gridy++;
        loginPanel.add(new JLabel("密码:"), gbc);
        gbc.gridy++;
        loginPanel.add(passwordField, gbc);
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.CENTER;
        loginPanel.add(loginButton, gbc);

        // 创建状态面板
        JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        statusPanel.add(statusLabel);

        // 创建登录窗口
        loginFrame = new JFrame("登录");
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setSize(400, 300);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 将面板添加到登录窗口中
        loginFrame.setLayout(new BorderLayout());
        loginFrame.add(loginPanel, BorderLayout.CENTER);
        loginFrame.add(statusPanel, BorderLayout.SOUTH);

        // 显示登录窗口
        loginFrame.setVisible(true);
    }

    private boolean validateUser(String username, String password) {
        // 用户验证逻辑
        User user = new User();
        user.addUser("carol","2398269504");
        return user.validateUser(username, password);
    }

    private void showMainInterface() {
        // 创建主界面窗口
        JFrame mainFrame = new JFrame("电话本管理系统 - 主界面");
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setSize(500, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建按钮面板
        JPanel buttonPanel = new JPanel(new GridLayout(5, 1, 10, 10));

        // 创建按钮
        JButton addButton = new JButton("添加联系人");
        JButton deleteButton = new JButton("删除联系人");
        JButton modifyButton = new JButton("修改联系人信息");
        JButton findButton = new JButton("查找联系人");
        JButton displayButton = new JButton("查看所有联系人");


        // 为每个按钮添加监听器
        addButton.addActionListener(e -> {
            // 创建添加联系人窗口
            JFrame addContactFrame = new JFrame("添加联系人");
            addContactFrame.setSize(300, 200);
            addContactFrame.setLocationRelativeTo(null);

            // 创建面板和布局
            JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

            // 添加组件
            panel.add(new JLabel("姓名："));
            JTextField nameField = new JTextField();
            panel.add(nameField);

            panel.add(new JLabel("电话："));
            JTextField phoneField = new JTextField();
            panel.add(phoneField);

            JButton confirmButton = new JButton("确认");
            panel.add(confirmButton);

            // 添加面板到窗口中
            addContactFrame.add(panel);

            // 添加确认按钮的点击事件处理逻辑
            confirmButton.addActionListener(confirmEvent -> {
                String name = nameField.getText();
                String phone = phoneField.getText();

                // 验证电话号码格式
                if (Validator.isValidPhoneNumber(phone)) {
                    // 添加联系人
                    phoneBook.addContact(name, phone);
                    saveContacts();
                    JOptionPane.showMessageDialog(null, "联系人添加！", "添加成功", JOptionPane.INFORMATION_MESSAGE);
                    // 关闭添加联系人窗口
                    addContactFrame.dispose();
                } else {
                    // 显示电话号码格式错误提示
                    JOptionPane.showMessageDialog(addContactFrame, "电话号码格式错误，请输入正确的电话号码！", "错误", JOptionPane.ERROR_MESSAGE);
                }
            });

            // 设置窗口可见
            addContactFrame.setVisible(true);
        });


        deleteButton.addActionListener(e -> {
            // 弹出对话框，询问用户要删除哪个联系人
            String nameToDelete = JOptionPane.showInputDialog(null, "请输入要删除的联系人姓名:", "删除联系人", JOptionPane.QUESTION_MESSAGE);

            // 检查用户是否输入了姓名
            if (nameToDelete != null && !nameToDelete.isEmpty()) {
                // 在电话本中删除对应的联系人
                boolean success = phoneBook.deleteContact(nameToDelete);

                // 根据删除结果显示消息
                if (success) {
                    JOptionPane.showMessageDialog(null, "联系人删除成功！", "删除成功", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "未找到要删除的联系人！", "删除失败", JOptionPane.ERROR_MESSAGE);
                }

                // 更新联系人列表的显示
                saveContacts();
            }
        });


        modifyButton.addActionListener(e -> {
            // 弹出对话框，询问用户要修改的联系人姓名以及修改后的信息
            String nameToModify = JOptionPane.showInputDialog(null, "请输入要修改的联系人姓名:", "修改联系人", JOptionPane.QUESTION_MESSAGE);

            // 检查用户是否输入了姓名
            if (nameToModify != null && !nameToModify.isEmpty()) {
                // 弹出对话框，让用户输入修改后的联系人信息
                String newName = JOptionPane.showInputDialog(null, "请输入修改后的联系人姓名:", "修改联系人", JOptionPane.QUESTION_MESSAGE);
                String newPhone = JOptionPane.showInputDialog(null, "请输入修改后的联系人电话:", "修改联系人", JOptionPane.QUESTION_MESSAGE);

                // 检查用户是否输入了新的联系人信息
                if (newName != null && !newName.isEmpty() && newPhone != null && !newPhone.isEmpty()) {
                    // 使用 Validator 类检查电话号码是否有效
                    if (Validator.isValidPhoneNumber(newPhone)) {
                        // 在电话本中修改对应的联系人信息
                        boolean success = phoneBook.modifyContact(nameToModify,newName, newPhone);

                        // 根据修改结果显示消息
                        if (success) {
                            JOptionPane.showMessageDialog(null, "联系人信息修改成功！", "修改成功", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "未找到要修改的联系人！", "修改失败", JOptionPane.ERROR_MESSAGE);
                        }

                        // 更新联系人列表的显示
                        saveContacts();
                    } else {
                        JOptionPane.showMessageDialog(null, "电话号码格式错误！", "错误", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });


        findButton.addActionListener(e -> {
            // 弹出对话框，询问用户要查找的联系人姓名
            String nameToFind = JOptionPane.showInputDialog(null, "请输入要查找的联系人姓名:", "查找联系人", JOptionPane.QUESTION_MESSAGE);

            // 检查用户是否输入了姓名
            if (nameToFind != null && !nameToFind.isEmpty()) {
                // 在电话本中查找联系人
                Contact contact = phoneBook.findContact(nameToFind);

                // 检查是否找到了联系人
                if (contact != null) {
                    // 显示联系人信息
                    JOptionPane.showMessageDialog(null, "联系人姓名: " + contact.getName() + "\n联系人电话: " + contact.getPhone(), "查找结果", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // 显示未找到联系人的消息
                    JOptionPane.showMessageDialog(null, "未找到联系人：" + nameToFind, "查找结果", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });


        displayButton.addActionListener(e -> {
            // 创建一个文本区域，用于显示联系人列表
            JTextArea contactListArea = new JTextArea(20, 40);
            contactListArea.setEditable(false); // 设置为不可编辑

            // 获取电话本中所有联系人的信息，并添加到文本区域中
            String allContacts = phoneBook.displayAllContacts();
            contactListArea.setText(allContacts);

            // 创建一个滚动面板，用于显示文本区域内容
            JScrollPane scrollPane = new JScrollPane(contactListArea);

            // 创建一个新窗口来显示联系人列表
            JFrame contactsFrame = new JFrame("所有联系人");
            contactsFrame.getContentPane().add(scrollPane);
            contactsFrame.pack();
            contactsFrame.setLocationRelativeTo(null); // 居中显示
            contactsFrame.setVisible(true);
        });

        // 将按钮添加到面板中
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(modifyButton);
        buttonPanel.add(findButton);
        buttonPanel.add(displayButton);

        // 将面板添加到主界面窗口中
        mainFrame.getContentPane().add(buttonPanel, BorderLayout.CENTER);

        // 显示主界面窗口
        mainFrame.setVisible(true);
    }
    private void loadContacts() {
        ArrayList<Contact> contacts = FilePhoneBook.loadContactsFromFile();
        // 将加载的联系人数据设置到电话本对象中
        phoneBook.setContacts(contacts);
    }
    private void saveContacts() {
        FilePhoneBook.saveContactsToFile(phoneBook.getContacts());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUIPhoneBook gui = new GUIPhoneBook();
            gui.initializeLoginPanel(); // 初始化登录界面
        });
    }
}
