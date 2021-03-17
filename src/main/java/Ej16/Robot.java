/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej16;

import java.util.Random;

/**
 *
 * @author Enrique
 */
public class Robot {
    Random aleatorio = new Random();
    private Integer numSerie;
    private Integer porcentajeVida;
    private static int contador = 0;

    public Robot() {
        this.numSerie = contador;
        this.porcentajeVida = aleatorio.nextInt(100-1+1)+1;
        contador++;
    }

    public Robot(Integer numSerie, Integer porcentajeVida) {
        this.numSerie = numSerie;
        this.porcentajeVida = porcentajeVida;
    }
    
    

    public Integer getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(int porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    public Integer getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    @Override
    public String toString() {
        return "Robot{" + "numSerie=" + numSerie + ", porcentajeVida=" + porcentajeVida + '}';
    }
    
    
}
