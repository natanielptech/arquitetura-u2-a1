package br.edu.arquitetura.u2a1.reuso.bom;

import java.nio.charset.StandardCharsets;

public class BibliotecaPdfLegada {
    public byte[] createDocument(String text) {
        return ("PDF:" + text).getBytes(StandardCharsets.UTF_8);
    }
}
