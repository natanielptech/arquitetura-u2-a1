package br.edu.arquitetura.u2a1.ocp.ruim;

public class CalculadoraDescontoRuim {
    public double aplicar(String tipo, double valor) {
        return switch (tipo) {
            case "NATAL" -> valor * 0.90;
            case "BLACK_FRIDAY" -> valor * 0.75;
            case "NOVO_CLIENTE" -> valor * 0.95;
            default -> valor;
        };
    }
}
