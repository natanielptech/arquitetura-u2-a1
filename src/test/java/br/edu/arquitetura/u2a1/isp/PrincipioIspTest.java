package br.edu.arquitetura.u2a1.isp;

import br.edu.arquitetura.u2a1.isp.bom.Robo;
import br.edu.arquitetura.u2a1.isp.bom.Trabalhavel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrincipioIspTest {
    @Test
    void roboImplementaSomenteContratoDeTrabalho() {
        Trabalhavel robo = new Robo();

        assertDoesNotThrow(robo::trabalhar);
    }

    @Test
    void interfaceAmplaForcaOperacoesSemSentido() {
        assertThrows(UnsupportedOperationException.class,
                () -> new br.edu.arquitetura.u2a1.isp.ruim.Robo().comer());
    }
}
