package br.com.fiap.Aula08revisao.services;

import br.com.fiap.Aula08revisao.models.Car;
import br.com.fiap.Aula08revisao.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Car create(Car car) {
        return carRepository.save(car);
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }
}