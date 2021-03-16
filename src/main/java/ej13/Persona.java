/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

/**
 *
 * @author enrique
 */
public abstract class Persona implements Identificable{
    private String nombre;
    private String apellido;
    private String nif;
    private Direccion dir;

    public Persona(String nombre, String apellido, String nif, Direccion dir) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.dir = dir;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", dir=" + dir + '}';
    }
    
    
}
