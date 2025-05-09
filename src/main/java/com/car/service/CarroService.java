package com.car.service;

import com.car.enuns.CarroTipo;
import com.car.factory.CarroFactory;
import com.car.implementacoes.HatchFactory;
import com.car.implementacoes.SedanFactory;
import com.car.implementacoes.SuvFactory;
import com.car.model.CarroModel;
//import com.car.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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