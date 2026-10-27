package br.edu.arquitetura.u2a1.dip.bom;

import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public void finalizar(String pedido) {
        repository.salvar(pedido);
    }
}
