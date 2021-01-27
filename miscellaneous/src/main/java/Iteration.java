import java.util.*;

/**
 * @Author Anjana Shankar
 * @Created 2021-01-11
 */
public class Iteration {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        // Basic for loop
        System.out.println("** BASIC FOR LOOP **");
        for(int i=0; i<numbers.size(); i++) {
            System.out.print(i+ " ");
        }

        System.out.println();
        System.out.println("** ENHANCED FOR LOOP **");
        for(int i: numbers) {
            System.out.print(i+ " ");
            numbers.remove(i);
        }

        System.out.println();
        for(int i: numbers) {
            System.out.print(i+ " ");
            if (i==3) {
                i=30;
            }
        }
        System.out.println();
        System.out.println("** ITERATOR **");

        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()) {
            int i = itr.next();
            System.out.print(i+ " ");

            if(i==3) {
                itr.remove();
            }
        }

        for(int i: numbers) {
            System.out.print(i+ " ");
        }

        System.out.println();
        System.out.println("** LIST ITERATOR **");

        ListIterator<Integer> litr = numbers.listIterator();
        while(litr.hasNext()) {
            int i = litr.next();
            System.out.print(i+ " ");
        }

        while (litr.hasPrevious()) {
            int i= litr.previous();
            System.out.print(i+ " ");
        }

        for(int i: numbers) {
            System.out.print(i+ " ");
        }

        System.out.println();
        System.out.println("** JAVA 8 STREAMS **");

        numbers.forEach(System.out::println);
        System.out.println("------------");
        numbers.stream().forEach((i) -> System.out.println(i));

    }
}
