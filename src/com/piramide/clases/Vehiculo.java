package com.piramide.clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo implements Serializable {

    private Integer km;
    private TipoVehiculo tipo;
    private Marca marca;
    private List<Revision> revisiones;

    public Vehiculo(Integer km, TipoVehiculo tipo, Marca marca) {
        this.km = km;
        this.tipo = tipo;
        this.marca = marca;
        this.revisiones = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "km=" + km +
                ", tipo=" + tipo +
                ", marca=" + marca +
                ", revisiones=" + revisiones +
                '}';
    }

}
