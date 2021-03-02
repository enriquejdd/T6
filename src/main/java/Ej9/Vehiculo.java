/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej9;

/**
 * Dada la siguiente clase: public abstract class Vehiculo{ private int
 * bastidor; public final void setBastidor(int bastidor){ this.bastidor =
 * bastidor;} public abstract int getVelocidad(); } ¿Puede tener descendencia
 * esta clase? ¿Se pueden sobrescribir todos sus métodos?
 *
 * @author enrique
 */
public abstract class Vehiculo {

    private int bastidor;

    public final void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }
    
    public abstract int getVelocidad();
    
    // Si puede tener descendencia al no ser una clase final.
    // No se puede sobrescribir su setBastidor ya que es final y con ello java no buscará otras posibles códigos del mismo método.
    // En cambio getVelocidad si se podria sobreescribir al ser abstracto.
}
