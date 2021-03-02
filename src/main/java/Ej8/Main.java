/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8;

/**
 *
 * @author enrique
 */
public class Main {

    public static void main(String[] args) {
        Moneda m1 = new Moneda();
        Moneda m2 = new Moneda();

        System.out.println(m1.lanzar());
        System.out.println(m2.lanzar());
        
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        
        System.out.println(d1.lanzar());
        System.out.println(d2.lanzar());
    }
}
