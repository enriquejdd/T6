/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7;

import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
        
        Trabajador t1 = new Camarero("Encargado", "Angel", "Pereira", "15463574E");
        Trabajador t2 = new Camarero("Empleado", "Jessica", "Stoneman", "48523697K");
        Trabajador t3 = new Barman("Empleado", "Adam", "Sanchez", "36698547U");
        Trabajador t4 = new Barman("Empleado", "Qiu", "Quian Quian", "45678921R");
        
        listaTrabajadores.add(t1);
        listaTrabajadores.add(t2);
        listaTrabajadores.add(t3);
        listaTrabajadores.add(t4);
        
        for (int i = 0; i < listaTrabajadores.size(); i++) {
            listaTrabajadores.get(i).cotizar();
            System.out.println("");
        }
    }
}
