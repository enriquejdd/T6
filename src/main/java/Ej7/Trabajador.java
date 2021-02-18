/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7;

/**
 * Transforma la clase Trabajador de los apuntes de clase en una clase abstracta
 * que incluya el método abstracto cotizar(). Crea la jerarquía de herencia que
 * cuelgue de la clase Trabajador, implementado el método abstracto en las
 * respectivas clases (además de la clase Camarero, inventa tú otra). Incluye
 * una clase de prueba con el método main(), donde haya una lista de cuatro
 * Trabajadores. Añade en la lista dos objetos Camarero y dos objetos del tipo
 * inventado por ti. Finalmente recorre la lista y llama al método cotizar() de
 * cada uno de los trabajadores, comprobando el comportamiento polimórfico de
 * dicho método.
 *
 * @author enrique
 */
public class Trabajador {

    private String nombre;
    private String apellido1;
    private String NIF;

    public Trabajador(String nombre, String apellido1, String NIF) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.NIF = NIF;
    }

    public void cotizar() {
        System.out.println("Cotizando como Trabajador");
    }
    // Se omiten getters y setters
}
