package br.inatel.cdg.model;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Fila<T> {
    List<T> filaInteiros = new ArrayList<T>();
    private int tamanho = 0;

    public int size(){
        return tamanho;
    }

    public boolean filaVazia(){
        return tamanho == 0;
    }

    public void enfileirarFila(T elemento){
        filaInteiros.add(elemento);
        tamanho++;
    }

    public T remove_first(){
        if(filaVazia())
            throw new EmptyStackException();
        T elemento = filaInteiros.remove(tamanho-1);
        tamanho--;
        return elemento;
    }
}
