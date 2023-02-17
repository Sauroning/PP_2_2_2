package web.Service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarServiceImp implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Honda", 5, 2002));
        cars.add(new Car("BMW", 6, 2013));
        cars.add(new Car("Tesla", 1, 2022));
        cars.add(new Car("Lada", 99, 1998));
        cars.add(new Car("Reno", 206, 1995));
    }

    public List<Car> getCarsList(int count) {
        if (count < 0 || count >= cars.size()) {
            return cars;
        } else {
            return cars.stream().limit(count).toList();
        }

    }
}
