package br.edu.arquitetura.u2a1.srp.bom;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FuncionarioRepositoryEmMemoria implements FuncionarioRepository {
    private final List<Funcionario> funcionarios = new ArrayList<>();

    @Override
    public void salvar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}
