package com.piramide.control;

import com.piramide.clases.Vehiculo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Taller implements TallerRepository{

    private static Taller taller = null;
    
    private final String fileVehiculo = "vehiculos";

    private Taller(){}

    public static Taller getInstance(){
        if(taller == null){
            taller = new Taller();
        }
        return taller;
    }

    @Override
    public List<Vehiculo> getVehiculos() {
        List<Vehiculo> vehiculos = null;
        try {
            FileInputStream fis = new FileInputStream(fileVehiculo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            vehiculos = (List<Vehiculo>) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if(vehiculos == null){
                vehiculos = new ArrayList<>();
            }
        }
        return vehiculos;
    }

    public void guardaVehiculo(Vehiculo vehiculo){
        List<Vehiculo> vehiculos = getVehiculos();
        vehiculos.add(vehiculo);
        try {
            FileOutputStream fos = new FileOutputStream(fileVehiculo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(vehiculos);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
