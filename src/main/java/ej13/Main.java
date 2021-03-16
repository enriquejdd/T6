/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class Main {
    public static void main(String[] args) {
        Direccion d1 = new Direccion("Calle Fuente de María Gil, 30", "Estepona", 29680, "España");
        
        Estudiante e1 = new Estudiante(1, "Juan", "Perez", "48592635E", d1);
        Estudiante e2 = new Estudiante(1, "Maria Esperanza", "de Castro", "74859612I", d1);
        Estudiante e3 = new Estudiante(1, "Ariadna", "Nieves", "45672596K", d1);
        Estudiante e4 = new Estudiante(1, "Cayetano", "Morales", "37851946G", d1);
        
        Profesor p1 = new Profesor("Lenguna", "Jose Antonio", "Jimenez", "19374628G", d1);
        Profesor p2 = new Profesor("Ingles", "Laura", "Cortes", "19482635H", d1);
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(e1);
        personas.add(e2);
        personas.add(e3);
        personas.add(e4);
        personas.add(p1);
        personas.add(p2);
        
        for (Persona persona : personas) {
            persona.identificate();
            persona.toString();
            
            if(persona instanceof Profesor){
                ((Profesor) persona).getEspecialidad();
            }
            if(persona instanceof Estudiante){
                ((Estudiante) persona).getIdEstudiante();
            }
            System.out.println("");
        }
    }
}
