package br.edu.arquitetura.u2a1.reuso;

import br.edu.arquitetura.u2a1.reuso.bom.AdaptadorBibliotecaPdf;
import br.edu.arquitetura.u2a1.reuso.bom.GeradorPdf;
import br.edu.arquitetura.u2a1.reuso.bom.RelatorioService;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReusoResponsavelTest {
    @Test
    void servicoUsaPortaPropriaComAdaptadorDaBiblioteca() {
        GeradorPdf adaptador = new AdaptadorBibliotecaPdf();
        RelatorioService service = new RelatorioService(adaptador);

        assertEquals("PDF:relatório", new String(service.gerar("relatório"), StandardCharsets.UTF_8));
    }
}
