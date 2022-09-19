package selennium;

public class EmConstructors {
    String name;
    int age;
    double salary;
    String city;
    static final String country ="India";
    public static void main (String[] args){
        EmConstructors em = new EmConstructors("Divya", 30);
        System.out.println(em.name + " " +  em.age+" "+ country);



    }


    public EmConstructors (String name, int age){
        this.name = name;
        this.age = age;


    }

    }
