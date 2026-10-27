# Exercícios

Os desafios usam Java e podem ser implementados sob `src/test/java` para praticar testes antes da mudança.

## 1. Identifique os smells

```java
class Pedido {
    double total(String tipoCliente, double preco, int quantidade, double frete) {
        double valor = preco * quantidade;
        if (tipoCliente.equals("VIP")) valor *= 0.9;
        return valor + frete;
    }
}
```

1. Quais decisões e responsabilidades estão misturadas?
2. Que teste deve ser escrito antes de extrair métodos?
3. Se surgirem muitos tipos de cliente, como aplicar Strategy/OCP?

## 2. Aplique ISP

Observe `isp.ruim.Trabalhador` e `isp.ruim.Robo`. Separe contratos por capacidade. Teste que `Robo` pode trabalhar sem implementar alimentação ou descanso.

## 3. Aplique DIP

Compare `dip.ruim.PedidoServiceRuim` e `dip.bom.PedidoService`. Escreva um teste usando Mockito para verificar a chamada ao repositório, sem banco de dados.

## 4. Faça reuso responsável

Troque a implementação da porta `GeradorPdf` por um fake em um teste. A aplicação cliente deve continuar sem conhecer o adaptador ou a API externa.

