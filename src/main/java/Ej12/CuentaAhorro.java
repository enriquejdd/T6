/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej12;

/**
 *
 * @author enrique
 */
public class CuentaAhorro extends Cuenta{
    private int interes;
    private int comisionAnual;

    public CuentaAhorro(int interes, int comisionAnual, Persona persona) {
        super(persona);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }
    

    public int getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(int comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
    @Override
    public void actualizarSaldo(double c) {
        double sal = this.getSaldo();        
        double saldoActualizado = (sal + (sal*interes))-comisionAnual;
        
        setSaldo(saldoActualizado);
        
    }

    @Override
    public void retirar(double c) {
        double sal = this.getSaldo();        
        double saldoActualizado = sal-c;
        
        setSaldo(saldoActualizado);
    }

    @Override
    public String toString() {
        String supp = super.toString();
        return supp + " CuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }
    
    
    
    
}
