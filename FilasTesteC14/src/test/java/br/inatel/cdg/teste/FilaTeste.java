package br.inatel.cdg.teste;

import org.junit.Test;
import br.inatel.cdg.model.Fila;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class FilaTeste {
    Fila<Integer> filaInteiros = new Fila<>();

    @Test
    public void enfileirarTeste(){
        filaInteiros.enfileirarFila(1);
        filaInteiros.enfileirarFila(2);
        int tamanho = filaInteiros.size();
        assertEquals(2,tamanho);
    }

    // Se existir elementos:

    @Test
    public void removerFilaTeste(){
        Fila<Integer> filaInteiros = new Fila<>();
        filaInteiros.enfileirarFila(1);
        filaInteiros.remove_first();
        assertEquals(0, filaInteiros.size());
    }

    // Se não existir elementos na fila com exception:

    @Test(expected = EmptyStackException.class)
    public void testeFilaException(){
        Fila<Integer> filaInteiros = new Fila<>();
        filaInteiros.remove_first();
    }

    @Test
    public void tamanhoFilaTeste(){
        Fila<Integer> filaInteiros = new Fila<>();
        filaInteiros.enfileirarFila(1);
        filaInteiros.enfileirarFila(2);
        assertEquals(2,filaInteiros.size());
    }

    @Test
    public void filaVaziaTeste(){
        Fila<Integer> filaInteiros = new Fila<>();
        boolean filaVazia = filaInteiros.filaVazia();
        assertTrue(filaVazia);
    }

}
