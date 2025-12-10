package Pack1;
import Pack2.Person;

public class BadPerson extends Person {
    protected String name;
    protected int age;
    public BadPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int Integ = Person.latestName.length();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
