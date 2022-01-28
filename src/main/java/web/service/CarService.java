package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarListByCount(List<Car> carList, int count);
    List<Car> setCarList();
}
