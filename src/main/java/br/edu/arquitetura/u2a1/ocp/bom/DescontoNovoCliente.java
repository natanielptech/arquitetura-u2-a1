package br.edu.arquitetura.u2a1.ocp.bom;

import org.springframework.stereotype.Component;

@Component
public class DescontoNovoCliente implements Desconto {
    @Override
    public String tipo() {
        return "NOVO_CLIENTE";
    }

    @Override
    public double aplicar(double valor) {
        return valor * 0.95;
    }
}
