package principal;

import java.util.EmptyStackException;

class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public void empilhar(int valor) {
        No novoNo = new No(valor);
        if (topo == null) {
            topo = novoNo;
        } else {
            novoNo.setProximo(topo);
            topo = novoNo;
        }
    }

    public int desempilhar() {
        if (topo == null) {
            throw new EmptyStackException();
        }
        int valor = topo.getValor();
        topo = topo.getProximo();
        return valor;
    }

    public int verTopo() {
        if (topo == null) {
            throw new EmptyStackException();
        }
        return topo.getValor();
    }

    public boolean estaVazia() {
        return topo == null;
    }
}