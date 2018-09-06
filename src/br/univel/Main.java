package br.univel;

public class Main {
    public static void main(String[] args) {
        BuscaLargura buscaLargura = new BuscaLargura();
        buscaLargura.criarGrafo();

        double totalTime = 0;
        double totalMemory = 0;
        int qtde = 0;
        double mediaTempo = 0;
        double mediaMemoria = 0;


        for (int i = 0; i < 10; i++) {
            long startTime = System.currentTimeMillis();
            long startMemory = Runtime.getRuntime().freeMemory();

            buscaLargura.buscaPorLargura("1", "20");

            long stopTime = System.currentTimeMillis();
            long stopMemory = Runtime.getRuntime().totalMemory();

            long memorySpend = (stopMemory - startMemory);
            long elapsedTime = (stopTime - startTime);

            totalTime += elapsedTime;
            totalMemory += memorySpend;
            qtde += 1;

            System.out.println(elapsedTime + " milisegundos");
            System.out.println(memorySpend + " bits");
        }

        mediaTempo = (totalTime / qtde);
        mediaMemoria =  (totalMemory / qtde);

        System.out.println("----------------------------------------");
        System.out.println("                 TOTAIS                 ");
        System.out.println("----------------------------------------");
        System.out.println("Tempo total.....: " + totalTime + " milisegundos");
        System.out.println("Memória total...: " + totalMemory + " bits");
        System.out.println("Média de tempo..: " + mediaTempo + " milisegundos");
        System.out.println("Média de memória: " + mediaMemoria + " bits");
        System.out.println("----------------------------------------");
    }
}
