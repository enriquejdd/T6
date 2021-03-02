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
public class Senador extends Legislador {

    private double complemento;

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public int getCamara() {
        Random ale = new Random();
        int camara = ale.nextInt(6) + 1;;

        return camara;
    }

    @Override
    public String toString() {
        String atrisup = super.toString();
        return atrisup + "Senador{" + "complemento=" + complemento + '}';
    }

}
