package com.piramide.control;

import com.piramide.clases.Vehiculo;

import java.util.List;

public interface TallerRepository {

    public List<Vehiculo> getVehiculos();
    public void guardaVehiculo(Vehiculo vehiculo);

}
