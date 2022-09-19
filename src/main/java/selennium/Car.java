package selennium;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Car {
    public ArrayList booking (String car) {
        ArrayList<String> carList = new ArrayList<String>();
        if (car.equals("Sedan")) {
            carList.add("City");
            carList.add("Civic");
            carList.add("Tata Indigo");

        }
        else if (car.equals("SUV")) {
            carList.add("Range Rover");
            carList.add("XUV700");

        }
        else if (car.equals("mini")) {
            carList.add("Copper");
            carList.add("Swift");

        }
        else {
            System.out.println("Car is not available....");
        }

      return carList;
    }
    public static void main(String[] args){
        Car car = new Car();
        ArrayList<String> sedanList = car.booking("Sedan");
        System.out.println(sedanList);


    }
}


