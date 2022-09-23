package web.service;

import web.model.Car;

import java.util.List;

public interface ServiceCar {

    void addCar(Car car);

    List<?> returnCar(int quantity);

}
