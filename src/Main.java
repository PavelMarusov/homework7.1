import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        a.add(scanner.next());
        a.add(scanner.next());
        a.add(scanner.next());
        a.add(scanner.next());
        a.add(scanner.next());
        System.out.println("Распечатай коллекцию А");
        Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            Object d = iterator.next();
            System.out.println(d);

        }
        ArrayList<String> b = new ArrayList<>();
        b.add(scanner.next());
        b.add(scanner.next());
        b.add(scanner.next());
        b.add(scanner.next());
        b.add(scanner.next());
        System.out.println("Распечатай коллекцию B ");
        Collections.sort(b);
        Collections.reverse(b);
        Iterator iterator1 = b.iterator();
        while (iterator1.hasNext()) {
            Object c = iterator1.next();
            System.out.println(c);
        }



        ArrayList<String> c = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            c.add(a.get(i));
            c.add(b.get(i));

        }



        /*c.add(0, a.get(0));
        c.add(1, b.get(0));
        c.add(2, a.get(1));
        c.add(3, b.get(1));
        c.add(4, a.get(2));
        c.add(5, b.get(2));
        c.add(6, a.get(3));
        c.add(7, b.get(3));
        c.add(8, a.get(4));
        c.add(9, b.get(4));*/

        System.out.println("______________________");
        Iterator iterator2 = c.iterator();
        while (iterator2.hasNext()) {
            Object o = iterator2.next();
            System.out.println(o);

        }
        System.out.println("Распечатай отсортированый список");
        Collections.sort(c, new Comparator<String>() {

            public int compare(String o, String o1) {
                return o.length() - o1.length();
            }
        });
        iterator2 = c.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


    }
}











