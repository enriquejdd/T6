/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7;

/**
 *
 * @author enrique
 */
public class Barman extends Trabajador{
    
    String rango;

    public Barman(String rango, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.rango = rango;
    }
    
    // Método propio de camarero
    public void servirEnBarra() {
        System.out.println("Objeto Barman: Sirviendo un la barra");
    }
    
    @Override
    public void cotizar() {
        System.out.println("Cotizando como Barman");
    }
}
