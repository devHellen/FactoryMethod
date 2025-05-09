package com.car.implementacoes;

import com.car.enuns.CarroTipo;
import com.car.factory.CarroFactory;
import com.car.model.CarroModel;

public class HatchFactory implements CarroFactory {
    @Override
    public CarroModel criarCarro() {
        var carro = new CarroModel();
        carro.setNome("Peugeot 208");
        carro.setNumeroPortas(2);
        carro.setCapacidadeCombustivel(47);
        carro.setTipo(CarroTipo.valueOf("HATCH"));
        return carro;
    }
}
