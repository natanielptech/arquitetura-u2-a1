package br.edu.arquitetura.u2a1.refatoracao.bom;

public record Endereco(String rua, String numero, String cidade, String cep) {
    public String formatar() {
        return rua + ", " + numero + ", " + cidade + ", " + cep;
    }
}
