package selennium;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList <Object> ar = new ArrayList <Object>();

        ar.add(10);
        ar.add(20);
        ar.add("Divya");
        System.out.println(ar.get(2));
        System.out.println("----------------");

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        System.out.println("----------------");

        for (Object n : ar) {
            System.out.println(n);
        }
        System.out.println("----------------");
        System.out.println("----------------");
 /*       ar.add(4, 100);
        System.out.println(ar.get(3));*/
    }
}



