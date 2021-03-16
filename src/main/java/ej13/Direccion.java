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
public class Direccion {
    private String nomCalle;
    private String nomCiudad;
    private int codPostal;
    private String nomPais;

    public Direccion(String nomCalle, String nomCiudad, int codPostal, String nomPais) {
        this.nomCalle = nomCalle;
        this.nomCiudad = nomCiudad;
        this.codPostal = codPostal;
        this.nomPais = nomPais;
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
    }

    public String getNomCalle() {
        return nomCalle;
    }

    public void setNomCalle(String nomCalle) {
        this.nomCalle = nomCalle;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" + "nomCalle=" + nomCalle + ", nomCiudad=" + nomCiudad + ", codPostal=" + codPostal + ", nomPais=" + nomPais + '}';
    }
    
    
}
