package br.edu.arquitetura.u2a1.srp.ruim;

public class FuncionarioRuim {
    private final String nome;
    private final String cargo;
    private final double salario;

    public FuncionarioRuim(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public String gerarRelatorioPdf() {
        return "PDF: " + nome + " - " + cargo + " - " + salario;
    }

    public String salvarNoBanco() {
        return "INSERT FUNCIONARIO " + nome;
    }
}
