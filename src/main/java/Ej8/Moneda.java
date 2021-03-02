/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class Moneda extends Azar{
    Random aleatorio = new Random();

    @Override
    public int lanzar() {
        int valor = aleatorio.nextInt(2)+1;
        
        return valor;
    }
    
}
