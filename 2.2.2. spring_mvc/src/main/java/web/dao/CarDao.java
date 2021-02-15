package web.dao;

import web.model.Car;

import java.util.List;

/**
 * @author pavelsmirnov
 */
public interface CarDao {
    List<Car> carList();
}
