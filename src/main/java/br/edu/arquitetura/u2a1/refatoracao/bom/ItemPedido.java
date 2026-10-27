package br.edu.arquitetura.u2a1.refatoracao.bom;

public record ItemPedido(double preco, int quantidade) {
    public double subtotal() {
        return preco * quantidade;
    }
}
