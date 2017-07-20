package aop;


import aop.model.Car;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleService {

    private Car car;

    public Car getCar() {
        return car;
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

}
