import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Person p1 = new Person("Andrei", "secretar", "22.03.2003");
        Person p2 = new Person("Alin", "sef", "20.03.2000");

        Company c1 = new Company("A", 23);
        list.add(p1.name);
        list.add(c1.name);

        p2.addRelationship(p1, "best-friend");
        p1.addRelationship(c1, p1.getSpecialization());

        System.out.println(p1);
        System.out.println(c1);
        System.out.println(list);
    }



}