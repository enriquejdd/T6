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
public class Estudiante extends Persona{
    private int idEstudiante;

    public Estudiante(int idEstudiante, String nombre, String apellido, String nif, Direccion dir) {
        super(nombre, apellido, nif, dir);
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "idEstudiante=" + idEstudiante + '}';
    }

    @Override
    public void identificate() {
        System.out.println("La persona " + this.getNombre() + " se identifica como Estudiante");
    }
    
    
}
