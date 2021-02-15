package web.service;

import web.model.Car;

import java.util.List;

/**
 * @author pavelsmirnov
 */
public interface CarService {
    List<Car> getCars(String count);
}
