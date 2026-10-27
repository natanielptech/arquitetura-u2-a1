package br.edu.arquitetura.u2a1.srp.bom;

import org.springframework.stereotype.Service;

@Service
public class RelatorioFuncionario {
    public String gerar(Funcionario funcionario) {
        return "PDF: " + funcionario.nome() + " - " + funcionario.cargo()
                + " - " + funcionario.salario();
    }
}
