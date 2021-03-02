/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej15;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class Diputado extends Legislador{

    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    
    @Override
    public int getCamara() {
        Random ale = new Random();
        int camara = ale.nextInt(6)+1;
        
        return camara;
    }

    @Override
    public String toString() {
        String atrisup = super.toString();
        return atrisup + "Diputado{" + "numeroAsiento=" + numeroAsiento + '}';
    }
    
    
    
}
