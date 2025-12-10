//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Pack2.Person;

import java.util.Scanner;

interface Shape {
    default String name() {
        return "Generic Shape";
    }
}

interface Colorable {
    default String color() {
        return "No Color";
    }
}

// Implement the interfaces in the 'Circle' class here
// Make sure to override the 'name()' method

class Circle implements Shape, Colorable {
    public String name() {
        return "Circle";
    }
}


// Create the 'ColoredCircle' class that extends 'Circle' and overrides 'color()'

class ColoredCircle extends Circle {
    @Override
    public String color() {
        return "Red";
    }
}

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("n = " + n);

        int val = sc.nextInt();
        switch (val) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("The value is less than zero or greater than two");
        }

        sc.close();

        Person dave = new Person("Dave", 24);
        Person bob = new Person("Bob", 27);
        System.out.println(dave.getName() + " " + dave.ageLastYear());
        System.out.println(dave.olderThan(bob) ? "Dave older than Bob" : "Bob older than Dave");
        Person tina = new Person();
        tina.setName("Tina");
        System.out.println(tina);
        System.out.println(Person.latestName);



        Scanner sc2 = new Scanner(System.in);
        String type = sc2.next().trim();
        System.out.println(type);
        System.out.println(type == "Circle");
        if (type == "Circle") {
            System.out.println(type);
            Circle circ = new Circle();
            System.out.println(circ.name());
            System.out.println(circ.color());
        }
        if (type.equals("ColoredCircle")) {
            System.out.println(type);
            ColoredCircle circ = new ColoredCircle();
            System.out.println(circ.name());
            System.out.println(circ.color());
        }
    }
}