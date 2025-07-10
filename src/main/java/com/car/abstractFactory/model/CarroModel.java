package com.car.abstractFactory.model;

import com.car.abstractFactory.enuns.CarroTipo;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
@Table(name = "carros")
public class CarroModel {
    private String nome;
    private int numeroPortas;
    private int capacidadeCombustivel;
    private CarroTipo tipo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void setCapacidadeCombustivel(int capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public void setTipo(CarroTipo tipo) {
        this.tipo = tipo;
    }
}
