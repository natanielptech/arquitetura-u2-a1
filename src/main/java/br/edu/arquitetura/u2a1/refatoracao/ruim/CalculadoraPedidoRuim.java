package br.edu.arquitetura.u2a1.refatoracao.ruim;

public class CalculadoraPedidoRuim {
    public double total(double valor, int quantidade, double frete, boolean clienteVip) {
        double subtotal = valor * quantidade;
        if (clienteVip) {
            subtotal = subtotal * 0.90;
        }
        return subtotal + frete;
    }
}
