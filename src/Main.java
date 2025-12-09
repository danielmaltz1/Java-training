//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
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
        System.out.println(dave.name + " " + dave.ageLastYear());
        System.out.println(dave.olderThan(bob) ? "Dave older than Bob" : "Bob older than Dave");
    }
}