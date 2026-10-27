package br.edu.arquitetura.u2a1.lsp;

import br.edu.arquitetura.u2a1.lsp.bom.Forma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrincipioLspTest {
    @Test
    void substitutosDaAbstracaoFormaRespeitamContratoDeArea() {
        Forma retangulo = new br.edu.arquitetura.u2a1.lsp.bom.Retangulo(4, 5);
        Forma quadrado = new br.edu.arquitetura.u2a1.lsp.bom.Quadrado(4);

        assertEquals(20, retangulo.area());
        assertEquals(16, quadrado.area());
    }

    @Test
    void quadradoQueHerdaDeRetanguloQuebraExpectativaDeAltura() {
        br.edu.arquitetura.u2a1.lsp.ruim.Retangulo forma =
                new br.edu.arquitetura.u2a1.lsp.ruim.Quadrado();
        forma.setLargura(4);
        forma.setAltura(5);

        assertEquals(25, forma.area());
    }
}
