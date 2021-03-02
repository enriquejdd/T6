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
public abstract class Cuenta {

    private String numCuenta;
    private double saldo;
    private Persona persona;
    private int num = 0;

    public Cuenta(Persona persona) {
        if (num > 10) {
            this.numCuenta = "2100 2587 1456 3687 000" + num;
        } else if (num < 10 && num > 100) {
            this.numCuenta = "2100 2587 1456 3687 00" + num;
        } else if (num < 100 && num > 1000) {
            this.numCuenta = "2100 2587 1456 3687 0" + num;
        } else {
            this.numCuenta = "2100 2587 1456 3687 " + num;
        }
        this.saldo = 0;
        this.persona = persona;
        num++;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void actualizarSaldo(double c) {

    }

    public void retirar(double c) {

    }

}
