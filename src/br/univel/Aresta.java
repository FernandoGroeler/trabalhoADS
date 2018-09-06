package br.univel;

public class Aresta implements Comparable<Aresta> {
    private String origem;
    private String destino;
    private int peso;

    public Aresta() {
    }

    public Aresta(String origem, String destino, int peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public int compareTo(Aresta o) {
        if (this.peso < o.peso) {
            return -1;
        }

        if (this.peso > o.peso) {
            return 1;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Aresta outra = (Aresta) obj;
        return (this.origem.equals(outra.origem) && this.destino.equals(outra.destino));
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }
}
