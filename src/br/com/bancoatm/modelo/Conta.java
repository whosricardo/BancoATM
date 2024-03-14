package br.com.bancoatm.modelo;

public class Conta {
    private Cliente titular;
    private int numero;
    private double saldo;

    // Construtor
    public Conta(Cliente titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    // Métodos
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    // Getters | Setters

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    } 

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
