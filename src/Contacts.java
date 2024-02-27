public class Contacts {
    private String name;
    private String email;

    public static int numOfContacts;


    public Contacts(String name, String email) {
        this.name = name;
        this.email = email;

        numOfContacts ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display(){
        System.out.println(this.name+" there email is "+this.email);
    }
}
