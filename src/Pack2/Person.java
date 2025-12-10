package Pack2;

public class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        latestName = this.name;
    }

    public void setName(String name) {
        this.name = name;
        latestName = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public Person() {
        this.name = "Who knows";
        this.age = 0;
    }

    public static String latestName;

    public static void ageNextYear() {
        System.out.println("People age once per year!");
    }

    public String ageLastYear() {
        return "Last Year: " + --age;
    }

    public boolean olderThan(Person other) {
        return age >= other.age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
