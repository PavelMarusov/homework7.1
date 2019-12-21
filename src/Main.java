import java.util.*;
import java.util.concurrent.Callable;

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
        c.add(0, a.get(0));
        c.add(1, b.get(0));
        c.add(2, a.get(1));
        c.add(3, b.get(1));
        c.add(4, a.get(2));
        c.add(5, b.get(2));
        c.add(6, a.get(3));
        c.add(7, b.get(3));
        c.add(8, a.get(4));
        c.add(9, b.get(4));


        System.out.println("Распечатай коллекцию С");
        Iterator iterator2 = c.iterator();
        while (iterator2.hasNext()) {
            Object o = iterator2.next();
            System.out.println(o);

        }
        Collections.sort(c);

        System.out.println("Отсортированный список С");

        iterator2 = c.iterator();
        while (iterator2.hasNext()) {
            Object s = iterator2.next();
            System.out.println(s);
        }

//        System.out.println("_________________________");
//        for (int i = 0; i <c.size() ; i+=2) {
//            int p =1;
//            p+=2;
//        compareTo(c.get(i),c.get(p));
//
//        }



    }


//    public static  int compareTo(String o, String a) {
//        if(o.length()>a.length()){
//
//           System.out.println(o);
    //           return -1;
    //       }else if(o.length()<a.length()){
//            System.out.println(a);
    //           return 1;
    //     }
    //       return 0;
    //   }
}










