/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej15;

/**
 *
 * @author enrique
 */
public class Senador extends Legislador{
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String atrisup = super.toString();
        return atrisup + "Senador{" + "complemento=" + complemento + '}';
    }

    
    
    
    
    
}
