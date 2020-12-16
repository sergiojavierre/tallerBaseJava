package com.piramide.control;

import com.piramide.clases.Marca;
import com.piramide.clases.TipoVehiculo;
import com.piramide.clases.Vehiculo;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public void menuPrincipal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Alta vehículos\n2) Lista vehículos");
        System.out.print("Opción: ");
        String opcion = scanner.nextLine();
        switch (opcion){
            case "1":{
                menuAltaVehiculos();
                break;
            }
            case "2":{
                menuListaVehiculos();
                break;
            }
        }
    }

    public void menuAltaVehiculos(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de la marca: ");
        String marcaVehiculo = scanner.nextLine();
        System.out.print("Número de km: ");
        Integer kmVehiculo = Integer.parseInt(scanner.nextLine());
        System.out.print("Tipo de vehiculo: ");
        String tipoVehiculoText = scanner.nextLine().toLowerCase();
        TipoVehiculo tipoVehiculo;
        if(tipoVehiculoText.equals("coche")){
            tipoVehiculo = TipoVehiculo.COCHE;
        }
        else if(tipoVehiculoText.equals("moto")){
            tipoVehiculo = TipoVehiculo.MOTO;
        }
        else{
            tipoVehiculo = TipoVehiculo.OTRO;
        }
        Marca marca = new Marca(marcaVehiculo);
        Vehiculo vehiculo = new Vehiculo(kmVehiculo,tipoVehiculo,marca);
        //Taller.guardaVehiculo(vehiculo);
        Taller.getInstance().guardaVehiculo(vehiculo);
    }

    public void menuListaVehiculos(){
        List<Vehiculo> vehiculos = Taller.getInstance().getVehiculos();
        System.out.println(vehiculos);
    }

}
