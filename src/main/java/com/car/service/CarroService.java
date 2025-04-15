package com.car.service;

import com.car.model.CarroModel;
//import com.car.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CarroService {
    public CarroModel criarCarro(String type) throws ClassNotFoundException {

        if (Objects.equals(type, "SUV")) {
            var carro = new CarroModel();
            carro.setNome("Jeep Compass");
            carro.setNumeroPortas(4);
            carro.setCapacidadeCombustivel(60);
            carro.setTipo("SUV");
            return carro;
        } else if (Objects.equals(type, "SEDAN")) {
            var carro = new CarroModel();
            carro.setNome("Toyta Corolla");
            carro.setNumeroPortas(4);
            carro.setCapacidadeCombustivel(50);
            carro.setTipo("SEDAN");
            return carro;
        } else if (Objects.equals(type, "HATCH")) {
            var carro = new CarroModel();
            carro.setNome("Peugeot 208");
            carro.setNumeroPortas(2);
            carro.setCapacidadeCombustivel(47);
            carro.setTipo("HATCH");
            return carro;
        } else {
            throw new ClassNotFoundException("Type not configured.");
        }
    }

    public List<CarroModel> listarTodosCarros() {
        // Aqui você pode buscar os carros de um banco de dados ou outra fonte de dados
        return List.of(

        );
    }


}
