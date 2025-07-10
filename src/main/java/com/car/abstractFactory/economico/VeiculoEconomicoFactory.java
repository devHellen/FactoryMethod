package com.car.abstractFactory.economico;

import com.car.abstractFactory.Carro;
import com.car.abstractFactory.FabricaVeiculos;
import com.car.abstractFactory.Motocicleta;

public class VeiculoEconomicoFactory implements FabricaVeiculos {
    @Override
    public Carro criarCarro() {
        return new CarroEconomico();
    }

    @Override
    public Motocicleta criarMotocicleta() {
        return new MotocicletaEconomica();
    }
}
