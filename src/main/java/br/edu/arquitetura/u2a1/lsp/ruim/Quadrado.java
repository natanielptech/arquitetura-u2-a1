package br.edu.arquitetura.u2a1.lsp.ruim;

public class Quadrado extends Retangulo {
    @Override
    public void setLargura(int largura) {
        this.largura = largura;
        this.altura = largura;
    }

    @Override
    public void setAltura(int altura) {
        this.largura = altura;
        this.altura = altura;
    }
}
