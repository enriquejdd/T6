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
public class CuentaCorriente extends Cuenta {

    private final double interes = 1.5;
    private int saldoMin;

    public CuentaCorriente(int saldoMin, Persona persona) {
        super(persona);
        this.saldoMin = saldoMin;
    }

    public int getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(int saldoMin) {
        this.saldoMin = saldoMin;
    }

    public double getInteres() {
        return interes;
    }

    @Override
    public void actualizarSaldo(double c) {
        double sal = CuentaCorriente.super.getSaldo();
        if (sal > 1000) {
            double saldoActualizado = sal + (saldoMin * interes);
            setSaldo(saldoActualizado);
        } else {
            double saldoActualizado = sal + (sal + interes);
            setSaldo(saldoActualizado);
        }
    }

    @Override
    public void retirar(double c) {
        double sal = CuentaCorriente.super.getSaldo();
        if (sal - c < saldoMin) {

        } else {
            double saldoActualizado = sal - c;
            setSaldo(saldoActualizado);
        }
    }

    @Override
    public String toString() {
        String supp = super.toString();
        return supp + " CuentaCorriente{" + "interes=" + interes + ", saldoMin=" + saldoMin + '}';
    }

}
