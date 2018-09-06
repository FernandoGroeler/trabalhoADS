package br.univel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Busca {
    private List<String> vertices;
    private int matrizAdj[][];

    public String buscaPorLargura(Grafo grafo, String origem, String destino) {
        vertices = grafo.getVertices();
        matrizAdj = grafo.getMatrizAdj();

        String caminho = "Largura " + origem + " " + destino + ":\n";
        String retornoOperacao = validaOperacao(origem, destino);

        if (retornoOperacao == null) {
            String verticeAtual = "";
            List<String> lista = new ArrayList<String>();

            Set<String> verticesVisitados = new HashSet<String>();

            int cont = 1;
            int qtdVerticesVizinhos = 0;

            lista.add(origem);
            verticeAtual = origem;

            // Itera até que o vertice destino seja localizado ou até que todos os vertices sejam visitados.
            while (!verticeAtual.equals(destino) && !(verticesVisitados.size() == vertices.size())) {
                verticesVisitados.add(verticeAtual);

                caminho += verticeAtual + " foi visitado.\n";

                // Percorrer a matriz adjacente comparando a linha da matriz com o vertice atual. Ao localizar o vertice,
                // percorre a coluna e encontra os vizinhos do vertice atual.
                for (int i = 0; i < vertices.size(); i++) {
                    if (verticeAtual.equals(vertices.get(i))) {
                        for (int j = 0; j < vertices.size(); j++) {
                            if (matrizAdj[i][j] != 0) {
                                caminho += vertices.get(j) + " ";
                                qtdVerticesVizinhos++;

                                if (!lista.contains(vertices.get(j))) {
                                    lista.add(vertices.get(j));
                                }
                            }
                        }
                    }
                }

                if (qtdVerticesVizinhos == 1) {
                    caminho += "é vizinho de " + verticeAtual + ".\n";
                } else if (qtdVerticesVizinhos > 1) {
                    caminho += "são vizinhos de " + verticeAtual + "\n";
                }

                if (cont >= vertices.size()) {
                    break;
                }

                qtdVerticesVizinhos = 0;
                verticeAtual = lista.get(cont);
                cont++;
            }

            caminho += verticeAtual + " foi visitado.\n";
            caminho += "Destino " + verticeAtual + " foi encontrado.\n";
        } else {
            caminho += "Não foi possível executar operação.\n";
            caminho += retornoOperacao;
        }

        return caminho;
    }

    private String validaOperacao(String origem, String destino) {
        if (!vertices.contains(origem)) {
            return "Origem não existe no grafo.\n";
        } else if (!vertices.contains(destino)) {
            return "Destino não existe no grafo.\n";
        }

        return null;
    }
}
