package br.edu.arquitetura.u2a1.dip.bom;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PedidoRepositoryEmMemoria implements PedidoRepository {
    private final List<String> pedidos = new ArrayList<>();

    @Override
    public void salvar(String pedido) {
        pedidos.add(pedido);
    }

    public List<String> listar() {
        return List.copyOf(pedidos);
    }
}
