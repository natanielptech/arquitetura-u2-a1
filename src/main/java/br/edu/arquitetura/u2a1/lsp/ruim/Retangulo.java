package br.edu.arquitetura.u2a1.lsp.ruim;

public class Retangulo {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int area() {
        return largura * altura;
    }
}
