package com.car.implementacoes;

import com.car.enuns.CarroTipo;
import com.car.factory.CarroFactory;
import com.car.model.CarroModel;

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
