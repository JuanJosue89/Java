import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTester {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<String>();

        staff.addLast("Dick");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");

        ListIterator<String> iterator = staff.listIterator();
        iterator.next();
        iterator.next();

        iterator.add("Juliet");
        iterator.add("Nina");

        iterator.next();

        iterator.remove();

        iterator.previous();
        iterator.previous();
        iterator.previous();
        iterator.previous();

        for (String name : staff) {
            System.out.println(iterator.next() + " ");
            System.out.println();
        }

        System.out.println("Expected: Dick, Harry, Juliet, Nina, Tom");
    }
}
