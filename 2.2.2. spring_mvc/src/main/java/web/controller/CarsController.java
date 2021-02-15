package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

/**
 * @author pavelsmirnov
 */
@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String carsPage(ModelMap model, @RequestParam(value = "count", required = false) String count) {

        model.addAttribute("cars",carService.getCars(count));

        return "cars";
    }
}