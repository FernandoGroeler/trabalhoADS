package br.univel;

import java.util.List;

public class Grafo {
    private List<String> vertices;
    private List<Aresta> arestas;
    private int matrizAdj[][];

    public Grafo(List<String> vertices, List<Aresta> arestas, int[][] matrizAdj) {
        this.vertices = vertices;
        this.arestas = arestas;
        this.matrizAdj = matrizAdj;
    }

    public List<String> getVertices() {
        return vertices;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public int[][] getMatrizAdj() {
        return matrizAdj;
    }
}
