package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pavelsmirnov
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(String count) {
        List<Car> cars = carDao.carList();
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("Lada", "Yellow", 151));
//        cars.add(new Car("Audi", "MindNightBlue", 145));
//        cars.add(new Car("VW", "Silver", 100));
//        cars.add(new Car("Toyota", "Black", 990));
//        cars.add(new Car("Ford", "Green", 837));
        int countCar = 0;
            try {
                countCar = Integer.parseInt(count);
            } catch (NumberFormatException ignored) {
            }

        return cars.stream().limit((countCar < 5) ? countCar : cars.size()).collect(Collectors.toList());
    }
}
