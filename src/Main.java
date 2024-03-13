public class Main {
    public static void main(String[] args) {
    Contacts person1 = new Contacts("JIM","Jim@email.com" );
    person1.display();
    Business person2 = new Business("gg", "GG@email.com","614-222-2222");
    person2.display();
    Collection.theCollective(person1);
    Collection.theCollective(person2);
    Collection.display();


    }
}