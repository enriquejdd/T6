/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej11;

/**
 *
 * @author enrique
 */
public class Triangulo extends Figura{

    public Triangulo(int base, int altura) {
        super(base, altura);
    }
    
    @Override
    public int calcularArea() {
        int area = (base * altura)/2;
        
        return area;
    }
    
}
