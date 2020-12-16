package com.piramide.clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Revision implements Serializable {

    private Date fecha;
    private List<Pieza> piezas;
    private Empleado empleado;

    public Revision(Date fecha, Empleado empleado) {
        this.fecha = fecha;
        piezas = new ArrayList<>();
        this.empleado = empleado;
    }
}
