package br.edu.arquitetura.u2a1.srp;

import br.edu.arquitetura.u2a1.srp.bom.CalculadoraSalario;
import br.edu.arquitetura.u2a1.srp.bom.Funcionario;
import br.edu.arquitetura.u2a1.srp.bom.RelatorioFuncionario;
import br.edu.arquitetura.u2a1.srp.ruim.FuncionarioRuim;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrincipioSrpTest {
    @Test
    void comportamentoDeSalarioESeparacaoDeResponsabilidadesSaoPreservados() {
        FuncionarioRuim ruim = new FuncionarioRuim("Ana", "Analista", 5000);
        Funcionario funcionario = new Funcionario("Ana", "Analista", 5000);

        assertEquals(ruim.calcularSalario(), new CalculadoraSalario().calcular(funcionario));
        assertEquals(ruim.gerarRelatorioPdf(), new RelatorioFuncionario().gerar(funcionario));
        assertEquals("INSERT FUNCIONARIO Ana", ruim.salvarNoBanco());
    }
}
