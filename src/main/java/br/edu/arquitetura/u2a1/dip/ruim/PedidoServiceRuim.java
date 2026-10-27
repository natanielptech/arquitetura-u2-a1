package br.edu.arquitetura.u2a1.dip.ruim;

public class PedidoServiceRuim {
    private final PedidoRepositoryMySql repository = new PedidoRepositoryMySql();

    public String finalizar(String pedido) {
        return repository.salvar(pedido);
    }
}
