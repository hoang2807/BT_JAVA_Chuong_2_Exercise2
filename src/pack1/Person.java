package pack1;

public class Person {
    private String name;
    private int age;
    private String address;
    public static int count = 0;

    public Person() {
        age = 0;
        name = "No name";
        address = "No address";
        ++count;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "No address";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Address: " + address);
        System.out.println("Doi tuong thu " + count);
    }

    public static int getCount() {
        ++count;
        return count;
    }
}
