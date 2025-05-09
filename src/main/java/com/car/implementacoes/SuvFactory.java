package com.car.implementacoes;

import com.car.enuns.CarroTipo;
import com.car.factory.CarroFactory;
import com.car.model.CarroModel;

public class SuvFactory implements CarroFactory {
    @Override
    public CarroModel criarCarro() {
        var carro = new CarroModel();
        carro.setNome("Jeep Compass");
        carro.setNumeroPortas(4);
        carro.setCapacidadeCombustivel(60);
        carro.setTipo(CarroTipo.valueOf("SUV"));
        return carro;
    }
}
