package web.Dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class DaoCarImpl implements DaoCar {

    private List<Car> carMap = new ArrayList<>();
    {
        carMap.add(new Car("nissan", 322, "blue"));
        carMap.add(new Car("lada", 228, "black"));
        carMap.add(new Car("toyota", 123, "green"));
        carMap.add(new Car("peugeot", 321, "eloy"));
        carMap.add(new Car("subaru", 991, "yellow"));
    }


    @Override
    public void add(Car car) {
        carMap.add(car);
    }

    @Override
    public List<Car> returnCar(int quantity) {
        if (carMap.size() < quantity) {
            return carMap;
        }

        List<Car> listCar = new ArrayList<>();

        for (int i = 0; i <quantity; i++) {
            listCar.add(carMap.get(i));
        }
        return listCar;
    }
}
