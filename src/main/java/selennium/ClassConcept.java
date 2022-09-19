package selennium;

public class ClassConcept {
    public static void main(String[] args){
        ClassConcept cl = new ClassConcept();
        cl.test();
        int sum = cl.getMarks();
        System.out.println(sum);

    }
    public void test (){
        System.out.println("Some calculation");
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

    }
    public int getMarks(){
        int hindi = 90;
        int  Eng = 100;
        int sum = hindi + Eng;
        return sum;

    }
}
