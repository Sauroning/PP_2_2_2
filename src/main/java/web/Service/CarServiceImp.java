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

    public List<Car> getCarsList(String count) {
        if (count.equals("1") || count.equals("2") || count.equals("3") || count.equals("4")) {
            List<Car> carsResult = new ArrayList<>();
            for (int i = 0; i < Integer.parseInt(count); i++) {
                carsResult.add(cars.get(i));
            }
            return carsResult;
        } else {
            return cars;
        }
    }
}
