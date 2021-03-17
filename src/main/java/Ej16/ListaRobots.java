/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej16;

import Ej14.Frigorifico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Enrique
 */
public class ListaRobots {
    ArrayList<Robot> robots;

    public ListaRobots() {
        robots = new ArrayList<>();
    }
    
    public void añadirRobot(Robot r) {
        robots.add(r);
    }
    
    public void ordenarVida() {
        Comparator<Robot> criterio = (c1, c2) -> c1.getPorcentajeVida().compareTo(c2.getPorcentajeVida());
        Collections.sort(robots, criterio);
    } 
    
    public void ordenarNSerie() {
        Comparator<Robot> criterio = (c1, c2) -> c1.getNumSerie().compareTo(c2.getNumSerie());
        Collections.sort(robots, criterio);
    } 
    
    public int buscarRobot(Robot r) {
        Comparator<Robot> criterio = (c1, c2) -> c1.getNumSerie().compareTo(c2.getNumSerie());
        
        int posicion = Collections.binarySearch(robots, r, criterio);
        
        return posicion;
    }
    
    public void imprimirLista() {
        robots.forEach(System.out::println);
    }
    
    public void imprimirListaMenorVida() {
        ordenarVida();
        robots.forEach(System.out::println);
    }
    
    public int numeroRobots() {
        return robots.size();
    }
    
}
