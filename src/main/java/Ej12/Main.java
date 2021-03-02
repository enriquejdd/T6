/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej12;

/**
 *
 * @author enrique
 */
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Jose", "Casuso", "15983624E");
        CuentaAhorro ca1 = new CuentaAhorro(0, 0, p1);
        Persona p2 = new Persona("Fernanda", "Jimenez", "74185296I");
        CuentaAhorro ca2 = new CuentaAhorro(0, 0, p2);
        Persona p3 = new Persona("Jose", "Casuso", "15983624E");
        CuentaAhorro ca3 = new CuentaAhorro(0, 0, p3);
        Persona p4 = new Persona("Jose", "Casuso", "15983624E");
        CuentaCorriente cc1 = new CuentaCorriente(500, p4);
        Persona p5 = new Persona("Jose", "Casuso", "15983624E");
        CuentaCorriente cc2 = new CuentaCorriente(700, p5);
    }
}
