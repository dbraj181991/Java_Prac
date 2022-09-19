package selennium;

public class ConstructorsConcept {
    public static void main (String[] args){
        ConstructorsConcept c = new ConstructorsConcept(10);

    }
    public ConstructorsConcept(){
        System.out.println("with no param");
    }
    public ConstructorsConcept(int a){
        System.out.println("with 1 param:"  +    a);
    }
    public ConstructorsConcept(int a, int b){
        System.out.println("with 2 param" + a+b);
    }
}