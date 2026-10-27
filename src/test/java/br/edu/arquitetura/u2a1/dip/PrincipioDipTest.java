package br.edu.arquitetura.u2a1.dip;

import br.edu.arquitetura.u2a1.dip.bom.PedidoRepository;
import br.edu.arquitetura.u2a1.dip.bom.PedidoService;
import br.edu.arquitetura.u2a1.dip.ruim.PedidoServiceRuim;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class PrincipioDipTest {
    @Test
    void servicoDependeDaAbstracaoInjetada() {
        PedidoRepository repository = mock(PedidoRepository.class);
        PedidoService service = new PedidoService(repository);

        service.finalizar("pedido-42");

        verify(repository).salvar("pedido-42");
    }

    @Test
    void implementacaoConcretaMostraAcoplamentoAntesDaRefatoracao() {
        assertEquals("MySQL: pedido-42",
                new PedidoServiceRuim().finalizar("pedido-42"));
    }
}
