package com.car.abstractFactory.implementacoes;

import com.car.abstractFactory.enuns.CarroTipo;
import com.car.abstractFactory.factory.CarroFactory;
import com.car.abstractFactory.model.CarroModel;

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
