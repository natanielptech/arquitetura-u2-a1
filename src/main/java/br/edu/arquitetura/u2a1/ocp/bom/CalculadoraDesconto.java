package br.edu.arquitetura.u2a1.ocp.bom;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CalculadoraDesconto {
    private final Map<String, Desconto> descontos;

    public CalculadoraDesconto(List<Desconto> descontos) {
        this.descontos = descontos.stream().collect(Collectors.toUnmodifiableMap(
                Desconto::tipo, Function.identity()));
    }

    public double aplicar(String tipo, double valor) {
        Desconto desconto = descontos.get(tipo);
        if (desconto == null) {
            throw new IllegalArgumentException("Tipo de desconto desconhecido: " + tipo);
        }
        return desconto.aplicar(valor);
    }
}
