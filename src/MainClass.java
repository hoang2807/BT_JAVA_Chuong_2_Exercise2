import pack1.Person;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("Vinh", 20);
        p1.display();
        p1.getCount();
        Person p2 = new Person("Hoang anh", 20, "Ha Noi");
        p2.display();
        p2.getCount();
    }
}
