package br.edu.arquitetura.u2a1;

import br.edu.arquitetura.u2a1.dip.bom.PedidoService;
import br.edu.arquitetura.u2a1.ocp.bom.CalculadoraDesconto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ContextoSpringTest {
    @Autowired
    private CalculadoraDesconto calculadoraDesconto;

    @Autowired
    private PedidoService pedidoService;

    @Test
    void injetaEstrategiasERepositorioPeloSpring() {
        assertEquals(90.0, calculadoraDesconto.aplicar("NATAL", 100.0));
        pedidoService.finalizar("pedido-42");
    }
}
