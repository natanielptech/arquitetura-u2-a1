package br.edu.arquitetura.u2a1.isp.ruim;

public class Robo implements Trabalhador {
    @Override
    public void trabalhar() {
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Robôs não comem");
    }

    @Override
    public void dormir() {
        throw new UnsupportedOperationException("Robôs não dormem");
    }
}
