package br.edu.arquitetura.u2a1.refatoracao;

import br.edu.arquitetura.u2a1.refatoracao.bom.CalculadoraPedido;
import br.edu.arquitetura.u2a1.refatoracao.bom.CalculadoraSubtotal;
import br.edu.arquitetura.u2a1.refatoracao.bom.Endereco;
import br.edu.arquitetura.u2a1.refatoracao.bom.ItemPedido;
import br.edu.arquitetura.u2a1.refatoracao.bom.Pedido;
import br.edu.arquitetura.u2a1.refatoracao.ruim.CalculadoraPedidoRuim;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RefatoracaoTest {
    @Test
    void extrairMetodosPreservaResultadoParaVipEClienteComum() {
        CalculadoraPedidoRuim antes = new CalculadoraPedidoRuim();
        CalculadoraPedido depois = new CalculadoraPedido();

        assertEquals(antes.total(100, 2, 15, true), depois.total(100, 2, 15, true));
        assertEquals(antes.total(100, 2, 15, false), depois.total(100, 2, 15, false));
    }

    @Test
    void extrairMetodoComumPreservaSubtotalDuplicado() {
        CalculadoraSubtotal depois = new CalculadoraSubtotal();

        assertEquals(50.0, subtotalDuplicadoA(10, 5));
        assertEquals(subtotalDuplicadoA(10, 5), depois.calcular(10, 5));
        assertEquals(subtotalDuplicadoB(7, 3), depois.calcular(7, 3));
    }

    @Test
    void moverRegraParaPedidoPreservaTotalLiquido() {
        Pedido pedido = new Pedido(List.of(
                new ItemPedido(10, 2), new ItemPedido(5, 1)), 3);

        assertEquals(totalConsultandoDadosExternos(pedido), pedido.totalLiquido());
        assertEquals(22.0, pedido.totalLiquido());
    }

    @Test
    void objetoEnderecoPreservaCadastroComParametrosLongos() {
        String antes = formatarEndereco("Rua A", "10", "Recife", "50000-000");
        Endereco endereco = new Endereco("Rua A", "10", "Recife", "50000-000");

        assertEquals(antes, endereco.formatar());
    }

    private double subtotalDuplicadoA(double preco, int quantidade) {
        return preco * quantidade;
    }

    private double subtotalDuplicadoB(double preco, int quantidade) {
        return preco * quantidade;
    }

    private double totalConsultandoDadosExternos(Pedido pedido) {
        return pedido.itens().stream()
                .mapToDouble(item -> item.preco() * item.quantidade())
                .sum() - pedido.desconto();
    }

    private String formatarEndereco(String rua, String numero, String cidade, String cep) {
        return rua + ", " + numero + ", " + cidade + ", " + cep;
    }
}
