package br.edu.arquitetura.u2a1.refatoracao.bom;

import java.util.List;

public record Pedido(List<ItemPedido> itens, double desconto) {
    public Pedido {
        itens = List.copyOf(itens);
    }

    public double totalLiquido() {
        return itens.stream().mapToDouble(ItemPedido::subtotal).sum() - desconto;
    }
}
