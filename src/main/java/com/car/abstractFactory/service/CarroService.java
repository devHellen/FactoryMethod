package com.car.abstractFactory.service;

import com.car.abstractFactory.enuns.CarroTipo;
import com.car.abstractFactory.factory.CarroFactory;
import com.car.abstractFactory.implementacoes.HatchFactory;
import com.car.abstractFactory.implementacoes.SedanFactory;
import com.car.abstractFactory.implementacoes.SuvFactory;
import com.car.abstractFactory.model.CarroModel;
//import com.car.repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CarroService {

    private final Map<CarroTipo, CarroFactory> factoryMap;

    public CarroService() {
        factoryMap = new HashMap<>();
        factoryMap.put(CarroTipo.SUV, new SuvFactory());
        factoryMap.put(CarroTipo.SEDAN, new SedanFactory());
        factoryMap.put(CarroTipo.HATCH, new HatchFactory());
    }

    public CarroModel criarCarro(CarroTipo type) throws IllegalArgumentException {
        CarroFactory carroFactory = factoryMap.get(type);

        if (carroFactory != null) {
            return carroFactory.criarCarro();
        } else {
            throw new IllegalArgumentException("Type not configured.");
        }
    }
}