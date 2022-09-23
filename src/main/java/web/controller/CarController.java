package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCar;
import web.service.ServiceCarImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    private ServiceCar serviceCar;
    @GetMapping(value = "/cars")
    public String printCar(ModelMap car, @RequestParam(value = "count", defaultValue = "5") int count) {

        car.addAttribute("messages", serviceCar.returnCar(count));
        return "car";
    }
}
