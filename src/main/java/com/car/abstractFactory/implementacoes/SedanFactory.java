package com.car.abstractFactory.implementacoes;

import com.car.abstractFactory.enuns.CarroTipo;
import com.car.abstractFactory.factory.CarroFactory;
import com.car.abstractFactory.model.CarroModel;

public class SedanFactory implements CarroFactory {
    @Override
    public CarroModel criarCarro() {
        var carro = new CarroModel();
        carro.setNome("Toyta Corolla");
        carro.setNumeroPortas(4);
        carro.setCapacidadeCombustivel(50);
        carro.setTipo(CarroTipo.valueOf("SEDAN"));
        return carro;
    }
}
