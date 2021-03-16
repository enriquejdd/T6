/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej14;

/**
 *
 * @author Enrique
 */
public class CampanaExtractora extends Electrodomestico{
    private int ruidodB;

    public CampanaExtractora(int ruidodB, double consumo, String modelo) {
        super(consumo, modelo);
        this.ruidodB = ruidodB;
    }

    public int getRuidodB() {
        return ruidodB;
    }

    public void setRuidodB(int ruidodB) {
        this.ruidodB = ruidodB;
    }

    @Override
    public String toString() {
        return "CampanaExtractora{" + "ruidodB=" + ruidodB + '}';
    }
    
    
}
