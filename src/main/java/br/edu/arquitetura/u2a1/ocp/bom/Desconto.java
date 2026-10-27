package br.edu.arquitetura.u2a1.ocp.bom;

public interface Desconto {
    String tipo();

    double aplicar(double valor);
}
