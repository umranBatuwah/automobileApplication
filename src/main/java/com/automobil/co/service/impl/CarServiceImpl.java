package com.automobil.co.service.impl;

import com.automobil.co.domain.Car;
import com.automobil.co.repository.CarRepository;
import com.automobil.co.service.CarService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Car}.
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {

    private final Logger log = LoggerFactory.getLogger(CarServiceImpl.class);

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car save(Car car) {
        log.debug("Request to save Car : {}", car);
        return carRepository.save(car);
    }

    @Override
    public Car update(Car car) {
        log.debug("Request to update Car : {}", car);
        return carRepository.save(car);
    }

    @Override
    public Optional<Car> partialUpdate(Car car) {
        log.debug("Request to partially update Car : {}", car);

        return carRepository
            .findById(car.getId())
            .map(existingCar -> {
                if (car.getCarName() != null) {
                    existingCar.setCarName(car.getCarName());
                }
                if (car.getNumberOfCar() != null) {
                    existingCar.setNumberOfCar(car.getNumberOfCar());
                }
                if (car.getCarMadeBy() != null) {
                    existingCar.setCarMadeBy(car.getCarMadeBy());
                }

                return existingCar;
            })
            .map(carRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Car> findAll() {
        log.debug("Request to get all Cars");
        return carRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Car> findOne(Long id) {
        log.debug("Request to get Car : {}", id);
        return carRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Car : {}", id);
        carRepository.deleteById(id);
    }
}
