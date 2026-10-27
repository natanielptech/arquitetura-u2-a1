package br.edu.arquitetura.u2a1.reuso.bom;

import org.springframework.stereotype.Service;

@Service
public class RelatorioService {
    private final GeradorPdf geradorPdf;

    public RelatorioService(GeradorPdf geradorPdf) {
        this.geradorPdf = geradorPdf;
    }

    public byte[] gerar(String conteudo) {
        return geradorPdf.gerar(conteudo);
    }
}
