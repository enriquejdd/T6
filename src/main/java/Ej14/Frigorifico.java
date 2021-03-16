/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Enrique
 */
public class Frigorifico extends Electrodomestico implements MuestraInformacion{
    private Integer cantidadLitros;
    private ArrayList<Frigorifico> frigos;

    public Frigorifico(int cantidadLitros, double consumo, String modelo) {
        super(consumo, modelo);
        this.cantidadLitros = cantidadLitros;
    }

    public Integer getCantidadLitros() {
        return cantidadLitros;
    }

    public void setCantidadLitros(int cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "cantidadLitros=" + cantidadLitros + '}';
    }

    @Override
    public void muestra() {
        System.out.println("La capacidad del frigorífico es de: " + cantidadLitros + " litros");
    }
    
    public void ordenarCantidadLitros() {
        Comparator<Frigorifico> criterio = (c1, c2) -> c1.getCantidadLitros().compareTo(c2.getCantidadLitros());
        Collections.sort(frigos, criterio);
    }   
    
}
