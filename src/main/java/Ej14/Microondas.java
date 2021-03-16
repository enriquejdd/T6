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
public class Microondas extends Electrodomestico implements MuestraInformacion{
    private Integer potenciaMax;
    private ArrayList<Microondas> micros;  

    public Microondas(int potenciaMax, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMax = potenciaMax;
    }

    public Integer getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    @Override
    public String toString() {
        return "Microondas{" + "potenciaMax=" + potenciaMax + '}';
    }

    @Override
    public void muestra() {
        System.out.println("La potencia máxima del mocroondas es de: " + potenciaMax + " vatios");
    }
    
    public void ordenarCantidadVatios() {
        Comparator<Microondas> criterio = (c1, c2) -> c1.getPotenciaMax().compareTo(c2.getPotenciaMax());
        Collections.sort(micros, criterio);
    } 
}
