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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String atrisup = super.toString();
        return atrisup + "Diputado{" + "numeroAsiento=" + numeroAsiento + '}';
    }
    
    
    
}
