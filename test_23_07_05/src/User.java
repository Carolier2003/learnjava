/**
 * {@code @Author} 19667
 * {@code @create} 2023/7/6 11:17
 */
public class User {
    private String useName;
    private String passWord;
    private String identityCardId;
    private String phoneNumber;

    public User() {

    }

    public User(String useName, String passWord, String identityCardId, String phoneNumber) {
        this.useName = useName;
        this.passWord = passWord;
        this.identityCardId = identityCardId;
        this.phoneNumber = phoneNumber;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getIdentityCardId() {
        return identityCardId;
    }

    public void setIdentityCardId(String identityCardId) {
        this.identityCardId = identityCardId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
