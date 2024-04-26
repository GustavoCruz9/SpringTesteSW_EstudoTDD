package com.fatec.sigvs.ti_tdd;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<Livro>();

    public void save(Livro livro){
        livros.add(livro);
    }

    public int size() {
        return livros.size();
    }

}
