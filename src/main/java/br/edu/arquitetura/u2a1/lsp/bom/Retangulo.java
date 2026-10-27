package br.edu.arquitetura.u2a1.lsp.bom;

public record Retangulo(int largura, int altura) implements Forma {
    @Override
    public int area() {
        return largura * altura;
    }
}
