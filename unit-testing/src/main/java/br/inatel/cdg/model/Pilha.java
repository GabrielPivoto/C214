package br.inatel.cdg.model;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T> {

    List<T> elementos = new ArrayList<T>();
    int tamanho = 0;

    public int size(){
        return tamanho;
    }

    public boolean pilhaVazia(){
        return (tamanho == 0);
    }

    public void push(T element){
        elementos.add(element);
        tamanho++;
    }

    public T pop(){
        if(pilhaVazia())
            throw new EmptyStackException();
        T elemento = elementos.remove(tamanho-1);
        tamanho--;
        return elemento;
    }
}
