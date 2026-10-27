package br.edu.arquitetura.u2a1.reuso.bom;

import org.springframework.stereotype.Component;

@Component
public class AdaptadorBibliotecaPdf implements GeradorPdf {
    private final BibliotecaPdfLegada biblioteca;

    public AdaptadorBibliotecaPdf() {
        this.biblioteca = new BibliotecaPdfLegada();
    }

    @Override
    public byte[] gerar(String conteudo) {
        return biblioteca.createDocument(conteudo);
    }
}
