/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej11;

/**
 *
 * @author enrique
 */
public abstract class Figura {

    protected int base;
    protected int altura;

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract int calcularArea();
}
