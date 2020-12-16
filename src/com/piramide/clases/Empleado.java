package com.piramide.clases;

import java.io.Serializable;

public class Empleado implements Serializable {

    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
}
