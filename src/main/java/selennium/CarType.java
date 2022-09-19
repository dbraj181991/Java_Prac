package selennium;

public class CarType {
    String name;
    String color;
    Double price;
    static final int wheels =4;

    public static void start(){
        System.out.println("Start the car......");
    }
    public void stop(){
        System.out.println("Stop the car......");
    }


    public static void main(String[] args){
        CarType c1 = new CarType();
        c1.name = "Honda";
        c1.color = "white";
        c1.price = 12345678.78;
        c1.stop();

        CarType c2 = new CarType();
        c2.name = "XUV";
        c2.color = "Black";
        c2.price = 1234678.78;

        CarType c3 = new CarType();
        c3.name = "BMW";
        c3.color = "Grey";
        c3.price = 123478.78;

        System.out.println(wheels);
        System.out.println(CarType.wheels);

    }
}
