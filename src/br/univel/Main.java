package br.univel;

public class Main {
    public static void main(String[] args) {
        BuscaLargura buscaLargura = new BuscaLargura();
        buscaLargura.criarGrafo();

        long startTime = System.currentTimeMillis();
        long startMemory = Runtime.getRuntime().freeMemory();

        buscaLargura.buscaPorLargura("1", "20");

        long stopTime = System.currentTimeMillis();
        long stopMemory = Runtime.getRuntime().totalMemory();

        long memorySpend = (stopMemory - startMemory);
        long elapsedTime = (stopTime - startTime);

        System.out.println(elapsedTime + " milisegundos");
        System.out.println(memorySpend + " bits");
    }
}
