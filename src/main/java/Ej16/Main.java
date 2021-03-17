/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej16;

import java.util.Random;

/**
 *
 * @author Enrique
 */
public class Main {

    public static void main(String[] args) {
        Random ale = new Random();
        ListaRobots LR = new ListaRobots();
        Robot a = new Robot();;

        for (int i = 0; i < 20; i++) {
            int x = ale.nextInt(20+1-1)+1;
            if (i == x) {
                LR.añadirRobot(a);
            } else {
                LR.añadirRobot(new Robot());
            }

        }

        System.out.println("Comprobamos los robots según su vida");
        LR.imprimirListaMenorVida();
        System.out.println("");

        ListaRobots LR50HP = new ListaRobots();
        for (int i = 0; i < LR.numeroRobots(); i++) {
            if (LR.robots.get(i).getPorcentajeVida() >= 50) {
                LR50HP.añadirRobot(new Robot(i, LR.robots.get(i).getPorcentajeVida()));
            }
        }

        System.out.println("Ahora vemos cuales son aquellos que tienen mas de 50 de vida.");
        LR50HP.imprimirLista();
        System.out.println("");

        System.out.println("Dentro de los que tienen 50 de vida los ordenamos por número de serie");
        LR50HP.ordenarNSerie();
        LR50HP.imprimirLista();
        System.out.println("");

        System.out.println("Buscamos al robot a");
        int pos = LR50HP.buscarRobot(a);
        System.out.println("El robot buscado se encuentra en la posicion " + pos);

    }
}
