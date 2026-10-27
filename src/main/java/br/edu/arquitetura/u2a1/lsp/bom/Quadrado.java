package br.edu.arquitetura.u2a1.lsp.bom;

public record Quadrado(int lado) implements Forma {
    @Override
    public int area() {
        return lado * lado;
    }
}
