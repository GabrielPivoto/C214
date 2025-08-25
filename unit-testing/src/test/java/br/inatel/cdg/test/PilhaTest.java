package br.inatel.cdg.test;

import br.inatel.cdg.model.Pilha;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PilhaTest {

    @Test
    public void testePilhaVazia(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        boolean vazia = pilhaInteiros.pilhaVazia();
        assertTrue(vazia);
    }

    @Test
    public void testePilhaPush(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(13);
        int tamanho = pilhaInteiros.size();
        assertEquals(1, tamanho);
    }

    @Test
    public void testePilhaPop(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(13);
        pilhaInteiros.pop();
        int tamanho = pilhaInteiros.size();

        assertEquals(0, tamanho);
    }

    @Test(expected = EmptyStackException.class)
    public void testePilhaPopException(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.pop();
    }

    @Test
    public void testePilhaRetorno(){
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        int valor = 13;
        pilhaInteiros.push(valor);
        int retorno = pilhaInteiros.pop();

        assertEquals(valor, retorno);
    }

}
