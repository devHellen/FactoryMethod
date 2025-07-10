package com.car.abstractFactory.controller;

import com.car.abstractFactory.enuns.CarroTipo;
import com.car.abstractFactory.model.CarroModel;
//import com.car.repository.CarroRepository;
import com.car.abstractFactory.service.CarroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carro")
public class CarroController {
    private CarroService service;

    private CarroController(CarroService service) {
        this.service = service;
    }

    @PostMapping("/inserir-carro/{type}")
    public ResponseEntity<CarroModel> criarCarro(@PathVariable("type") String type) throws ClassNotFoundException {
        return new ResponseEntity<CarroModel>(this.service.criarCarro(CarroTipo.valueOf(type)), HttpStatus.CREATED);
    }
}


