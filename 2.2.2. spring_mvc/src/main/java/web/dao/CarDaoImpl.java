package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pavelsmirnov
 */
@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> carList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", "Yellow", 151));
        cars.add(new Car("Audi", "MindNightBlue", 145));
        cars.add(new Car("VW", "Silver", 100));
        cars.add(new Car("Toyota", "Black", 990));
        cars.add(new Car("Ford", "Green", 837));

        return cars;
    }
}
