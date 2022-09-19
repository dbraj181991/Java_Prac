package selennium;

public class StaticArray {
    public static void main(String[] args) {
        Object e[] = new Object[5];
        e[0] = "Divya";
        e[1] = 30;
        e[2] = 23.33;
        e[3] = true;
        e[4] = 'm';
        for (int emp=0; emp<e.length;emp++){
            System.out.println(e[emp]);
        }

        System.out.println("----------------");
        for(Object emp:e){
           System.out.println(emp);
        }

    }

}
