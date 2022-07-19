package web.service;

import web.models.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "E200", "Germany"));
        cars.add(new Car("Volvo", "s60", "Sweden"));
        cars.add(new Car("KIA", "SOUL", "Korea"));
        cars.add(new Car("Hyundai", "Creta", "Korea"));
        cars.add(new Car("Lifan", "X60", "China"));

    }

    @Override
    public List<Car> getCars(int count) {
        return count < 5 & count > 0  ? cars.stream().limit(count).toList() : cars;
    }

}
