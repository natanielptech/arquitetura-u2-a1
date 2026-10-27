package br.edu.arquitetura.u2a1.refatoracao.bom;

public class CalculadoraPedido {
    public double total(double valor, int quantidade, double frete, boolean clienteVip) {
        return aplicarDesconto(subtotal(valor, quantidade), clienteVip) + frete;
    }

    private double subtotal(double valor, int quantidade) {
        return valor * quantidade;
    }

    private double aplicarDesconto(double subtotal, boolean clienteVip) {
        return clienteVip ? subtotal * 0.90 : subtotal;
    }
}
