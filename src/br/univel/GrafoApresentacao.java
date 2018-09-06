package br.univel;

import java.util.ArrayList;
import java.util.List;

public class GrafoApresentacao {
    private static String vertice1, vertice2, vertice3, vertice4, vertice5, vertice6, vertice7, vertice8, vertice9,
        vertice10, vertice11, vertice12, vertice13, vertice14, vertice15, vertice16, vertice17, vertice18, vertice19,
        vertice20;

    private static List<String> vertices;
    private static List<Aresta> arestas;
    private static Aresta aresta;
    private static int matrizAdj[][];

    public GrafoApresentacao() {

    }

    private static void inicializaAresta() {
        arestas = new ArrayList<Aresta>();

        for (int i = 0; i < vertices.size(); i++) {
            for (int j = 0; j < vertices.size(); j++) {
                if (matrizAdj[i][j] != 0) {
                    aresta = new Aresta(vertices.get(i), vertices.get(j), matrizAdj[i][j]);
                    arestas.add(aresta);
                }
            }
        }
    }

    private static int[][] montaMatrizAdj() {
        int matrizAdj[][] =
                {{0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                 {1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0},
                 {0,1,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0},
                 {0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                 {0,0,0,1,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,0},
                 {0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                 {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
                 {0,1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0},
                 {0,0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,0,0,0,0},
                 {0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                 {0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
                 {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0},
                 {0,0,1,0,0,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0},
                 {0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
                 {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},
                 {0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0},
                 {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0},
                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0},
                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1},
                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0}};

        return matrizAdj;
    }

    private static void inicializaVertices(String v1, String v2, String v3, String v4, String v5, String v6, String v7,
                                           String v8, String v9, String v10, String v11, String v12, String v13, String v14,
                                           String v15, String v16, String v17, String v18, String v19, String v20) {
        vertice1 = v1;
        vertice2 = v2;
        vertice3 = v3;
        vertice4 = v4;
        vertice5 = v5;
        vertice6 = v6;
        vertice7 = v7;
        vertice8 = v8;
        vertice9 = v9;
        vertice10 = v10;
        vertice11 = v11;
        vertice12 = v12;
        vertice13 = v13;
        vertice14 = v14;
        vertice15 = v15;
        vertice16 = v16;
        vertice17 = v17;
        vertice18 = v18;
        vertice19 = v19;
        vertice20 = v20;
    }

    private static void inicializaListaVertices() {
        vertices = new ArrayList<String>();

        vertices.add(vertice1);
        vertices.add(vertice2);
        vertices.add(vertice3);
        vertices.add(vertice4);
        vertices.add(vertice5);
        vertices.add(vertice6);
        vertices.add(vertice7);
        vertices.add(vertice8);
        vertices.add(vertice9);
        vertices.add(vertice10);
        vertices.add(vertice11);
        vertices.add(vertice12);
        vertices.add(vertice13);
        vertices.add(vertice14);
        vertices.add(vertice15);
        vertices.add(vertice16);
        vertices.add(vertice17);
        vertices.add(vertice18);
        vertices.add(vertice19);
        vertices.add(vertice20);
    }

    public static Grafo criaGrafoRotulado() {
        inicializaVertices("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20");

        inicializaListaVertices();

        matrizAdj = montaMatrizAdj();
        inicializaAresta();

        Grafo grafoRotulado = new Grafo(vertices, arestas, matrizAdj);

        return grafoRotulado;
    }
}
