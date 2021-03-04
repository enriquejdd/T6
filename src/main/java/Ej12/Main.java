/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej12;

import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        Persona p1 = new Persona("Jose", "Casuso", "15983624E");
        CuentaAhorro ca1 = new CuentaAhorro(3, 1, p1);
        Persona p2 = new Persona("Fernanda", "Jimenez", "74185296I");
        CuentaAhorro ca2 = new CuentaAhorro(1, 2, p2);
        Persona p3 = new Persona("Jose", "Casuso", "15983624E");
        CuentaAhorro ca3 = new CuentaAhorro(5, 2, p3);
        Persona p4 = new Persona("Jose", "Casuso", "15983624E");
        CuentaCorriente cc1 = new CuentaCorriente(500, p4);
        Persona p5 = new Persona("Jose", "Casuso", "15983624E");
        CuentaCorriente cc2 = new CuentaCorriente(700, p5);
        
        System.out.println("Añadimos saldos a las cuentas");
        System.out.println("");
        ca1.actualizarSaldo(1500);
        ca2.actualizarSaldo(763);
        ca3.actualizarSaldo(2999);
        cc1.actualizarSaldo(0);
        cc2.actualizarSaldo(0);
        
        System.out.println("Mostramos los saldos");
        ca1.toString();
        System.out.println(ca2.getSaldo());
        System.out.println(ca3.getSaldo());
        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());
        
        System.out.println("");
        System.out.println("Retiramos dinero de cada cuenta");
        System.out.println("");
        ca1.actualizarSaldo(500);
        ca2.actualizarSaldo(100);
        ca3.actualizarSaldo(153.5);
        cc1.actualizarSaldo(158);
        cc2.actualizarSaldo(300);
        
        System.out.println("Mostramos los saldos");
        System.out.println(ca1.getSaldo());
        System.out.println(ca2.getSaldo());
        System.out.println(ca3.getSaldo());
        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());
    }
}
