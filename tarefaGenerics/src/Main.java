import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Civic());
        cars.add(new Corolla());


        for (Car car : cars) {
            System.out.println(car);
        }
    }
}