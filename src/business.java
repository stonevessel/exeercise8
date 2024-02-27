public class business extends Contacts{
    private String phoneNum;

    public business(String name, String email, String phoneNum) {
        super(name, email);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public void display() {
        System.out.println(getName()+" there email is "+getEmail()+" there phone number is "+this.phoneNum);
    }
}
