package br.edu.arquitetura.u2a1.srp.bom;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraSalario {
    public double calcular(Funcionario funcionario) {
        return funcionario.salario();
    }
}
