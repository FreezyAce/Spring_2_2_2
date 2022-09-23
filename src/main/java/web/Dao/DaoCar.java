package web.Dao;

import web.model.Car;

import java.util.List;

public interface DaoCar {

    void add(Car car);

    List<?> returnCar(int quantity);

}
