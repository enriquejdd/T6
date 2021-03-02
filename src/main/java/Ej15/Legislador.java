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
public abstract class Legislador extends Persona {

    private String provincia;
    private String partidoPolitico;

    public Legislador(String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public abstract int getCamara();

    @Override
    public String toString() {
        return "Legislador{" + "provincia=" + provincia + ", partidoPolitico=" + partidoPolitico + '}';
    }

}
