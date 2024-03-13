import java.util.ArrayList;

public class Collection{
    static ArrayList<Contacts> collection = new ArrayList<>();

    static void display(){
        System.out.println(collection);
    }

    static void theCollective(Contacts a ){
        collection.add(a);
        System.out.println("Contact added.");
    }



}
