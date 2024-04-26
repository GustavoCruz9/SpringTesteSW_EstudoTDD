package com.fatec.sigvs.ti_tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Req01CadastrarLivro {

    Biblioteca biblioteca;

    @Test
    public void ct01_cadastrar_livro_com_sucesso () {
        //dado que o usuario entrou com as informações do livro
        biblioteca = new Biblioteca();
        Livro livro = new Livro("Harry Potter", "J, K. Roaling");
        //quando usuário confirma alteração
        biblioteca.save(livro);
        //então o livro fica disponivel para consulta
        assertEquals(1, biblioteca.size());
    }
    
}
