package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pavelsmirnov
 */
@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String carsPage(ModelMap model, @RequestParam(value = "count", required = false) String count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", "Yellow", 151));
        cars.add(new Car("Audi", "MindNightBlue", 145));
        cars.add(new Car("VW", "Silver", 100));
        cars.add(new Car("Toyota", "Black", 990));
        cars.add(new Car("Ford", "Green", 837));
        Car c = new Car("Ford", "Green", 837);
        int countCar = 0;
        try {
            countCar = Integer.parseInt(count);
        } catch (NumberFormatException ignored) {
        }

        System.out.println("Count = " + count);
        model.addAttribute("cars",
                cars.stream().limit((countCar < 5) ? countCar : cars.size()).collect(Collectors.toList()));
        return "cars";
    }
}

class Car {
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    private String model;
    private String color;
    private int number;

    public Car(String model, String color, int number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }
}