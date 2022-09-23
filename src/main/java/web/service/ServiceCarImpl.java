package web.service;

import org.springframework.stereotype.Service;
import web.Dao.DaoCar;
import web.Dao.DaoCarImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCarImpl implements ServiceCar {
    private static final DaoCarImpl dao = new DaoCarImpl();


    @Override
    public void addCar(Car car) {
        dao.add(car);
    }

    @Override
    public List<Car> returnCar(int quantity) {
        return dao.returnCar(quantity);
    }
}
