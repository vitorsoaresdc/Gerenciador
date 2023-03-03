package com.example.gerenciador;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    //Cria a lista
    private static List<Empresa> lista = new ArrayList<>();
    public void adiciona(Empresa empresa) {
       lista.add(empresa);
    }

    public List<Empresa> getEmpresas() {
        return this.lista;
    }
}
