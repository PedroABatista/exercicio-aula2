package br.com.alura.exercicio2.som;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;
    private int somaDasCurtidas;
    private int totalDeCurtidas;

    public int getSomaDasCurtidas() {
        return somaDasCurtidas;
    }
    public void avalia (int curtidas) {
        somaDasCurtidas += curtidas;
        somaDasCurtidas ++;
    }

    /*public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }*/

    public void setTotalDeReproducao(int totalDeReproducao) {
        this.totalDeReproducao = totalDeReproducao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void descricao(){
        System.out.println("Nome : " + titulo);
        System.out.println("Tempo de duração  em segundos : " + duracao);
        System.out.println("Vezes reproduzidas : " + totalDeReproducao);
        if(classificacao < 18) {
            System.out.println("Livre para todos os públicos ");
        }else if(classificacao >= 18){
            System.out.println("Restrito para adultos ");
        }else {
            System.out.println("Inválido");
        }
        //System.out.println("Quantidade de curtidas : " + curtidas);
    }
}
