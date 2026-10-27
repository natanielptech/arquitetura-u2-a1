package br.edu.arquitetura.u2a1.ocp;

import br.edu.arquitetura.u2a1.ocp.bom.CalculadoraDesconto;
import br.edu.arquitetura.u2a1.ocp.bom.DescontoBlackFriday;
import br.edu.arquitetura.u2a1.ocp.bom.DescontoNatal;
import br.edu.arquitetura.u2a1.ocp.bom.DescontoNovoCliente;
import br.edu.arquitetura.u2a1.ocp.ruim.CalculadoraDescontoRuim;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrincipioOcpTest {
    @Test
    void estrategiasPreservamOsDescontosExistentes() {
        CalculadoraDescontoRuim ruim = new CalculadoraDescontoRuim();
        CalculadoraDesconto bom = new CalculadoraDesconto(List.of(
                new DescontoNatal(), new DescontoBlackFriday(), new DescontoNovoCliente()));

        for (String tipo : List.of("NATAL", "BLACK_FRIDAY", "NOVO_CLIENTE")) {
            assertEquals(ruim.aplicar(tipo, 100), bom.aplicar(tipo, 100));
        }
    }

    @Test
    void tipoDesconhecidoFalhaExplicitamente() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto(List.of(new DescontoNatal()));

        assertThrows(IllegalArgumentException.class, () -> calculadora.aplicar("OUTRO", 100));
    }
}
