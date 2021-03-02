/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej15;

import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Diputado> diputados = new ArrayList<>();
        diputados.add(new Diputado(15, "Cadiz", "P", "Jose", "Muñoz"));
        diputados.add(new Diputado(25, "Malaga", "E", "Lucia", "Gutiérrez"));
        diputados.add(new Diputado(63, "Madrid", "E", "Antonio", "Garcia"));
        diputados.add(new Diputado(5, "Valencia", "E", "Isabel", "Martín"));

        
        ArrayList<Senador> senadores = new ArrayList<>();
        senadores.add(new Senador(45, "Cadiz", "P", "Daniel", "Sánchez"));
        senadores.add(new Senador(45, "Malaga", "E", "Juan", "Díaz"));
        senadores.add(new Senador(45, "Madrid", "I", "Laura", "López"));
        senadores.add(new Senador(45, "Valencia", "C", "Ana", "García"));        

        System.out.println("Diputados");
        for (Diputado f : diputados) {
            System.out.println(f.toString());
        }
        
        System.out.println("");
        System.out.println("Senadores");
        for(Senador f : senadores){
            System.out.println(f.toString());
        }
    }
}
