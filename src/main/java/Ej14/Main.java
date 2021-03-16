/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej14;

import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomestico = new ArrayList<>();
        
        Frigorifico f1 = new Frigorifico(385, 175 , "Frigorífico Combi RB38T671DSA");
        Frigorifico f2 = new Frigorifico(212 , 175 , "Frigorífico combi - Jocel JF");
        
        Microondas m1 = new Microondas(800, 1200 , "Samsung GE 87M-X");
        Microondas m2 = new Microondas(700 , 1000, "Taurus 970.930 Ready");
        
        electrodomestico.add(f1);
        electrodomestico.add(f2);
        electrodomestico.add(m1);
        electrodomestico.add(m2);
        
        ArrayList<Electrodomestico> MuestraInformacion = new ArrayList<>();
        
        for (Electrodomestico e : electrodomestico) {
            if(e instanceof MuestraInformacion){
                MuestraInformacion.add(e);
            }
        }
        
        for (Electrodomestico ele : MuestraInformacion) {
            if(ele instanceof MuestraInformacion){
                ((MuestraInformacion) ele).muestra();
            }
        }
        
        ArrayList<Frigorifico> frigo = new ArrayList<>();
        Frigorifico f3 = new Frigorifico(436, 365, "Frigorífico Americano KUNFT KSBS3916N");
        
        
        frigo.add(f1);
        frigo.add(f2);
        frigo.add(f3);
        
        f3.ordenarCantidadLitros();
        
        

    }
}
