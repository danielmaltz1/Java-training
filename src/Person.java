public class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void ageNextYear() {
        System.out.println("People age once per year!");
    }

    public String ageLastYear() {
        return "Last Year: " + --age;
    }

    public boolean olderThan(Person other) {
        return age >= other.age;
    }
}
