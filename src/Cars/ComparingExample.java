package Cars;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparingExample {
    public static void main(String[] args) {
        Car blackOpel = new Car("black", "opel", 2000);
        Car redOpel = new Car("red", "opel", 2500);
        Car yellowMazda = new Car("yellow", "mazda", 3000);
        Car greenMazda = new Car("green", "mazda", 3000);

        // отсортировали сначала по бренду, потом по цене и затем по цвету
        Comparator<Car> carComparator = new CarBrandComparator().thenComparing(new CarPriceComparator()).thenComparing(new CarColorComparator());

        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(redOpel);
        carArrayList.add(blackOpel);
        carArrayList.add(yellowMazda);
        carArrayList.add(greenMazda);

        System.out.println("до сортировки " + carArrayList);

        carArrayList.sort(carComparator);

        System.out.println("после сортировки " + carArrayList);
    }
}

class CarBrandComparator implements Comparator<Car>{

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getBrand().compareTo(car2.getBrand());
    }
}

class CarPriceComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return Integer.compare(car1.getPrice(), car2.getPrice());
    }
}

class CarColorComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getColor().compareTo(car2.getColor());
    }
}
