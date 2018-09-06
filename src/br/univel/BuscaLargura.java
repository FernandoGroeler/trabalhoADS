package br.univel;

public class BuscaLargura {
    private Grafo grafo;
    private Busca busca;

    public void criarGrafo() {
        grafo = GrafoApresentacao.criaGrafoRotulado();
        busca = new Busca();
    }

    public void buscaPorLargura(String origem, String destino) {
        String resultado = "";
        resultado = busca.buscaPorLargura(grafo, origem, destino);
        System.out.println(resultado);
    }
}
